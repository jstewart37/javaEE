package OfflineMode;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import org.hibernate.service.spi.InjectService;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findByColour(String Colour) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findByPorouseware(String isPorous) {
		// TODO Auto-generated method stub
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
}