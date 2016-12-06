package services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

import EntityManagers.ProductManager;
import EntityManagers.StockManager;
import Entitys.Product;
import Entitys.Stock;

@SessionScoped
public class ProductService implements Serializable {
	@Inject
	private ProductManager productManager;
	@Inject
	private StockManager stockManager;

	public Product findProductById(String id) {
	try {
	return findProductById(Long.parseLong(id));
	} catch (Exception e) {
	return null;
	}
	}

	public Product findProductById(long id) {
		return productManager.findByID((int) id);
	}

	public List<Product> findAll() {
		return productManager.findAll();
	}

	public Product getProduct(long id) {
		return getProduct(productManager.findByID(id), stockManager.findById(id));
	}

	public Product getProduct(long id, Stock stock) {
		return getProduct(productManager.findByID(id), stock);
	}

	public Product getProduct(Product product, long id) {
		return getProduct(product, stockManager.findById(id));
	}

	public Product getProduct(Product product, Stock stock) {
		Product Product = new Product(stock.getId());
		if (product != null)
			Product.addProductInfo(product.getName(), product.getDescription(), product.getColour(), product.getSellPrice(),
					product.getImgPath());					
		if (stock != null)
			Product.addStockInfo(product.getName(), product.getDescription(), product.getColour(), product.getStockLevel(), product.getSellPrice(),
					product.getBuyPrice(),product.getStatus(), product.getImgPath());	
		return Product;
	}

	public List<Product> findAllActive() {
		List<Product> items = new ArrayList<Product>();
		stockManager.findByActive().forEach(stock -> {
			items.add(getProduct(stock.getId(), stock));
		});
		return items;
	}

	public Product getProduct(Product product, Object id) {
		// TODO Auto-generated method stub
		return null;
	}

}
