/**
 * 
 * Author = Alex
 * 
 * 
 * **/


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
		Product product = productManager.findByID((int) id);
		if (product == null)
			product = new Product(1, "My name is wrong", "My description sucks", "invisible", 0, 0.0, 0.0, "available", "path", "yes");
		return product;
	}


	public List<Product> findAll() {
		return productManager.findAll();
	}

	public Product getProduct(long id) {
		System.out.println(id);
		return getProduct(productManager.findByID(id));

	}

	public Product getProduct(Product product) {
		System.out.println("STEP 3 - ISSUE?");
		Product productItem = new Product(product.getIdProduct());
		if (product != null)
			productItem.addProductInfo(product.getName(), product.getDescription(), product.getColour(), product.getSellPrice(), null);	
		System.out.println("product found - not null");
		return productItem;
	}



}
