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

	private static final long serialVersionUID = -2203125956354526185L;
	@Inject
	private SelectedProduct selectProduct;
	@Inject
	private ProductService productService;
	
	private Product product = null;
	private long ID;
	private String name;
	private String description;
	private String colour;

	private int stockLevel;
	private double sellPrice;
	private double buyPrice;
	private String status;
	private String path;
	private String pw;
	
	
	public SelectedProduct getSelectProduct() {
		return selectProduct;
	}

	public void setSelectProduct(SelectedProduct selectProduct) {
		this.selectProduct = selectProduct;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getColour() {
		return colour;
	}

	public int getStockLevel() {
		return stockLevel;
	}

	public double getBuyPrice() {
		return buyPrice;
	}

	public String getStatus() {
		return status;
	}

	public String getPath() {
		return path;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setID(long iD) {
		ID = iD;
	}

	
	
	
	public Product getProduct(){
		return product;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
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
	
	
	public Product getProduct(int PID){
		return product;
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
	

	public String select(long id) {
		System.out.println("Step 1 WORKING");
		Product item = productService.getProduct(id);
		if (item != null) {
			selectProduct.setProduct(item);
			System.out.println("Final Step");
			return "product";
		}
		return "browse";
	}
	
	
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product select(@PathParam("id") String id) {
		return productService.findProductById(id);
	}

	public long setID(){
		this.ID = productService.getNext();
		if(ID < 10)
		return ID;
		System.out.println("its gonna work");
		return ID;
	}
	
	public long getID(){
		this.ID = productService.getNext();
		if(ID < 10)
		return ID;
		System.out.println("its gonna work");
		return ID;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setDescription(String description){
		this.description = description;
	}
	public void setColour(String colour){
		this.colour = colour;
	}
	public void setStockLevel(int stockLevel){
		this.stockLevel = stockLevel;
	}
	public void sellPrice(double sellPrice){
		this.sellPrice = sellPrice;
	}
	public void setBuyPrice(double buyPrice){
		this.buyPrice = buyPrice;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public void setPath(String path){
		this.path = path;
	}
	public void setisPorousware(String pw){
		this.pw = pw;
	}
	
	public String addProduct(){ 
		System.out.println("passing information from controller to service");
		productService.addProduct(ID, name, description, colour, stockLevel, sellPrice, buyPrice,
				status, path, pw);
	return "ProductPage";
}


	
	
	
	//FINISH UP THIS SHIT THEN ONTO THE SERVICE FOR THE FUNCTIONALITY OF THIS ADDPRODUCT FUNCTION
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
