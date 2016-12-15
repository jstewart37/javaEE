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
	private BasketManager basketManager;
	@Inject
	private ProductManager productManager;
	@Inject
	private ProductService productService;
	@Inject
	private StockManager stockManager;

	public List<Product> getBasketlist(long id) {
		System.out.println("in basket service. getting list");
		List<Product> basketList = new ArrayList<>();
		try{
			System.out.println("trying some shit, off to the manager");
			basketManager.findByCustomerId(id).forEach(stock->{
				basketList.add(productService.getProduct(productManager.findByID(stock.getIdProduct())));	
				System.out.println("ALL THIS SHIT DOESN'T WORK.");
			});
		} finally {}
		return basketList;
	}
	
	public void add(long customerId, long productId) {
		List<Product> itemList = basketManager.findByCustomerId(customerId); // gets the customers current basket
		System.out.println("MY BASKET IS EMPTY");
		if(itemList == null) {
			System.out.println("made a new list for the customers products to go in");
			itemList = new ArrayList<Product>();
		}
		for(Product product : itemList)
			if(product.getIdProduct() == productId)	// product already exists in basket.
				return;
		System.out.println("off to the manager to add a product to the basket.");
		itemList.add(productManager.findByID(productId));
		basketManager.updateBasketList(customerId, itemList);
		
	}

	public void removeFromBasketlist(long customerId, long productId) {
		List<Product> wishlist = new ArrayList<>();
		for(Product product : basketManager.findByCustomerId(customerId))
			if(product.getIdProduct() != productId)
				wishlist.add(product);
		basketManager.updateBasketList(customerId, wishlist);
	}
}
