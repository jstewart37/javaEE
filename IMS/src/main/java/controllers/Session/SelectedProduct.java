package controllers.Session;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import Entitys.Product;

@SessionScoped
@Named("selected")
public class SelectedProduct implements Serializable {
	private static final long serialVersionUID = -1891410328473605505L;
	private Product product;

	public Product getProduct() { return product; }
	public void setProduct(Product product) { System.out.println("setting product value"); this.product = product; }
}