/**
 * 
 * Author = Alex
 * 
 * 
 * **/



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
	
	public String getName() {
		Product product = productService.findProductById(1);
		return product.getName();
	}
	
	public String getDescription() {
		Product product = productService.findProductById(1);
		return product.getDescription();
	}
	
	public String getPrice(){
		Product product = productService.findProductById(1);
		StringBuilder sb = new StringBuilder();
		sb.append("£");
		sb.append(product.getSellPrice());
		String productInfo = sb.toString();
		return productInfo; 
	}
	
	public String getImage(){
		Product product = productService.findProductById(1);
		return product.getImgPath();
	}
	
	public void setProduct(Product product) {
		// TODO Auto-generated method stub
		
	}
	
	public Product getProduct(int PID){
		return product;
	}
	
	public String getFirst(int PID) {
		Product product = productService.findProductById(PID);
		return product.getName();
	}
	
	public String getDescription(int PID) {
		Product product = productService.findProductById(PID);
		return product.getDescription();
	}
	
	public String getPrice(int PID){
		Product product = productService.findProductById(PID);
		StringBuilder sb = new StringBuilder();
		sb.append("£");
		sb.append(product.getSellPrice());
		String productInfo = sb.toString();
		return productInfo; 
	}
	
	public String getImage(int PID){
		Product product = productService.findProductById(PID);
		return product.getImgPath();
	}
	

}
