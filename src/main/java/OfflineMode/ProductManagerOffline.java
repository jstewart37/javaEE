package OfflineMode;

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
		List<Product> products = testData.getProducts();
		for (Product products1 : products)
			if(products1.getIdProduct()==ID)
				return products1;
		return null;
	}

	@Override
	public Product findByDescription(String Description) {
		List<Product> products = testData.getProducts();
		for (Product products2 : products)
			if(products2.getDescription().equalsIgnoreCase(Description))
				return products2;
		return null;
	}

	@Override
	public Product findByStatus(String Status) {
		List<Product> products = testData.getProducts();
		for (Product products3 : products)
			if(products3.getStatus().equalsIgnoreCase(Status))
				return products3;
		return null;
	}
	@Override
	public Product findByColour(String Colour) {
		List<Product> products = testData.getProducts();
		for (Product products4 : products)
			if(products4.getColour().equalsIgnoreCase(Colour))
				return products4;
		return null;
	}

	@Override
	public Product findByPorouseware(String isPorous) {
		List<Product> products = testData.getProducts();
		for (Product products5 : products)
			if(products5.getIsPorousware().equalsIgnoreCase(isPorous))
				return products5;
		return null;
	}

	@Override
	public Product addProduct(Product Product) {
		List<Product> products = testData.getProducts();
		// for (Product products6 : products)
		//	if(products6.geta)
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByDescriptionLike(String description) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Product> findAll() {
		return testData.getProducts();
	}

	@Override
	public Product findByID(long id) {
		// TODO Auto-generated method stub
		return null;
	}
}