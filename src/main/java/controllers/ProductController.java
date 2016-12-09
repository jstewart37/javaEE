/**
 * 
 * Author = Alex
 * 
 * 
 * **/



package controllers;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import Entitys.Product;
import controllers.Session.SelectedProduct;
import services.ProductService;

@Named("productCon")
@Path("/productCon")
@RequestScoped
public class ProductController implements Serializable{

	@Inject
	private SelectedProduct selectedProduct;
	@Inject
	private ProductService productService;
	
	private Product product = null;
	
	public Product getProduct(){
		return product;
	}
	
	public String getName() {
<<<<<<< HEAD
		Product product = productService.findProductById(1);
=======
>>>>>>> d0cacf55e3a05063f68d530b926f8825adc75b42
		return product.getName();
	}
	
	public String getDescription() {
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
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product select(@PathParam("id") String id) {
		return productService.findProductById(id);
}
	
	public String select(long id) {
		Product item = productService.getProduct(id);
		if (item != null) {
			selectedProduct.setProduct(item);
			return "product";
		}
		return "browse";
	}

}
