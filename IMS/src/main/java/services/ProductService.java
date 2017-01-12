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

@SessionScoped
public class ProductService implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2915332035810651682L;
	@Inject
	private ProductManager productManager;

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
			product = new Product(1, "My name is wrong", "My description sucks", "invisible", 0, 0.0, 0.0, "available",
					"path", "yes");
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
		Product productItem = new Product(product.getIdProduct());
		if (product != null)
			productItem.addProductInfo(product.getName(), product.getDescription(), product.getColour(),
					product.getSellPrice(), null);
		return productItem;
	}

	public long getNext() {
		 return productManager.getNext();
		

	}

	@SuppressWarnings("null")
	public void addProduct(long vidProduct, String vname, String vdescription, String vcolour, int vstockLevel,
			double vsellPrice, double vbuyPrice, String vstatus, String path, String pw) {
	
			Product p = new Product(
					vidProduct,
					vname,
					vdescription, 
					vcolour, 
					vstockLevel, 
					vsellPrice,
					vbuyPrice,
					vstatus, 
					path, 
					pw)	;
	
				productManager.addProduct(p);
				System.out.println("product created.");
			
	
		
		
	}

}
