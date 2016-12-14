package services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import EntityManagers.BasketManager;
import EntityManagers.ProductManager;
import EntityManagers.StockManager;
import Entitys.Product;
import Entitys.Stock;
import OfflineMode.BasketManagerOffline;


@Stateless
public class BasketService {
	@Inject
	private BasketManager wishlistManager;
	@Inject
	private ProductManager productManager;
	@Inject
	private ProductService productService;
	@Inject
	private StockManager stockManager;

	public List<Product> getWishlist(long id) {
		List<Product> wishlist = new ArrayList<>();
		try{
			BasketManagerOffline.findByCustomerId(id).forEach(stock->{
				wishlist.add(productService.getProductItem(productManager.findById(stock.getId()), stock));	
			});
		} finally {}
		return wishlist;
	}
	
	public void addToWishlist(long customerId, long productId) {
		List<Stock> wishlist = BasketManagerOffline.findByCustomerId(customerId);
		if(wishlist == null) {
			wishlist = new ArrayList<Stock>();
		}
		for(Stock stock : wishlist)
			if(stock.getId() == productId)
				return;
		wishlist.add(stockManager.findById(productId));
		basketManager.updateWishList(customerId, wishlist);
	}

	public void removeFromWishlist(long customerId, long productId) {
		List<Stock> wishlist = new ArrayList<>();
		for(Stock stock : basketManager.findByCustomerId(customerId))
			if(stock.getId() != productId)
				wishlist.add(stock);
		basketManager.updateWishList(customerId, wishlist);
	}
}
