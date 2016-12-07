package controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Entitys.Product;
import services.ProductService;

@Named("product")
@SessionScoped
public class ProductController implements Serializable{

	
	@Inject
	private ProductService productService;
	
	private Product product = null;
	
	public Product getProduct(){
		return product;
	}
	
	public String getfirst() {
		Product product = productService.findProductById(1);
		return product.getName();
	}
	
	public String getprice(){
		Product product = productService.findProductById(1);
		StringBuilder sb = new StringBuilder();
		sb.append("£");
		sb.append(product.getSellPrice());
		String productInfo = sb.toString();
		return productInfo; 
		
	}
	
	public void setProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

}
