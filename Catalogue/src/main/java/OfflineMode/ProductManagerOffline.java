package OfflineMode;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;


import EntityManagers.ProductManager;
import Entitys.Product;
import Entitys.TestData;

@Stateless
@Default
public class ProductManagerOffline implements ProductManager {
	@Inject
	private TestData testData;

	@Override
	public Product findProductbyName(String name) {
		List<Product> products = testData.getProducts();
		for (Product product : products)
			if(product.getName().equalsIgnoreCase(name))
				return product;
		return null;
	}

	@Override
	public Product findByID(int ID) {
		for (Product products : testData.getProducts())
			if(products.getIdProduct()==ID)
				return products;
		
		return new Product(1, "could not find this product", "My description sucks", "invisible", 12, 11.0, 10.0, "available", "path", "yes" , "gnome");
	}

	@Override
	public Product findByDescription(String Description) {
		List<Product> products = testData.getProducts();
		for (Product product : products)
			if(product.getDescription().equalsIgnoreCase(Description))
				return product;
		return null;
	}

	@Override
	public Product findByStatus(String Status) {
		List<Product> products = testData.getProducts();
		for (Product product : products)
			if(product.getStatus().equalsIgnoreCase(Status))
				return product;
		return null;
	}
	@Override
	public Product findByColour(String Colour) {
		List<Product> products = testData.getProducts();
		for (Product product : products)
			if(product.getColour().equalsIgnoreCase(Colour))
				return product;
		return null;
	}

	@Override
	public Product findByPorouseware(String isPorous) {
		List<Product> products = testData.getProducts();
		for (Product product : products)
			if(product.getIsPorousware().equalsIgnoreCase(isPorous))
				return product;
		return null;
	}

	@Override
	public Product addProduct(Product Product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product displayProductInformation(Product Product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(Product Product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product deleteProduct(Product Product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByNameLike(String name) {
		List<Product> products = new ArrayList<>();
		for(Product product : testData.getProducts())
			if (product.getName().toLowerCase().contains(name.toLowerCase()))
				products.add(product);
		return products;
	}
	

	@Override
	public List<Product> findByDescriptionLike(String description) {
		List<Product> products = new ArrayList<>();
		for(Product product : testData.getProducts())
			if (product.getDescription().toLowerCase().contains(description.toLowerCase()))
				products.add(product);
		return products;
	}
	
	@Override
	public List<Product> findByCategory(String category) {
		List<Product> products = new ArrayList<>();
		for(Product product : testData.getProducts())
			if (product.getCategory().toLowerCase().contains(category.toLowerCase()))
				products.add(product);
		return products;
	}
	
	@Override
	public List<Product> findByColourlike(String colour) {
		List<Product> products = new ArrayList<>();
		for(Product product : testData.getProducts())
			if (product.getColour().toLowerCase().contains(colour.toLowerCase()))
				products.add(product);
		return products;
	}


	@Override
	public List<Product> findAll() {
		return testData.getProducts();
	}

	@Override
	public Product findByID(long id) {
		for (Product products : testData.getProducts())
			if(products.getIdProduct() == id)
				return products;
		
		return new Product(1, "could not find this product", "My description sucks", "invisible",210, 220.0, 230.0, "available", "path", "yes" , "gnome");
	}

}