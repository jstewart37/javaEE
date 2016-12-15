package controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import EntityManagers.ProductManager;
import Entitys.Product;

//@Author Sophie

@RequestScoped
@Named(value = "addproduct")
public class CreateProductController {
	
	private long idProduct = 0;
	private String name;
	private String description;
	private String colour;
	private int stockLevel = -1;
	private double sellPrice = 0;
	private double buyPrice = 0;
	private String isPorousware;
	private String status;
	
	
	
	
	//Getters and Setters

	public long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(long idProduct) {
		this.idProduct = idProduct;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getStockLevel() {
		return stockLevel;
	}
	public void setStockLevel(int stockLevel) {
		this.stockLevel = stockLevel;
	}
	public double getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}
	public double getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}
	public String getIsPorousware() {
		return isPorousware;
	}
	public void setIsPorousware(String isPorousware) {
		this.isPorousware = isPorousware;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String addnewProduct() {
		if (idProduct >0 && !name.isEmpty() && !description.isEmpty() && !colour.isEmpty() && stockLevel>-1 && sellPrice>0&& buyPrice>0 && !isPorousware.isEmpty()&& !status.isEmpty()) {
		Product addProduct = new Product(1,name,description, colour, stockLevel, sellPrice, buyPrice, isPorousware, status, null);
		System.out.println(addProduct + "product created"); // for debugging
			return "index";
		}
		System.out.println("wooooooooo");
		return "index";
	}

	
	
}