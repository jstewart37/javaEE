package controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import EntityManagers.CustomerManager;
import EntityManagers.SupplyOrderManager;
import Entitys.Customer;
import Entitys.SupplyOrder;
import services.CreateAccountService;

//@Author Jake
@RequestScoped
@Named(value = "addorder")
public class CreateOrderController {
	@Inject
	private SupplyOrderManager supplyManager;
	
	private String status = "Placed";
	private String suppliername = "";
	private String placedon = "";
	private String OrderItems = "";
	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	



	public String getSuppliername() {
		return suppliername;
	}




	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}




	public String getPlacedon() {
		return placedon;
	}




	public void setPlacedon(String placedon) {
		this.placedon = placedon;
	}




	public String getOrderItems() {
		return OrderItems;
	}




	public void setOrderItems(String orderItems) {
		OrderItems = orderItems;
	}




	public int getTotalPrice() {
		return TotalPrice;
	}




	public void setTotalPrice(int totalPrice) {
		TotalPrice = totalPrice;
	}




	public String getPottentialDeliveryDate() {
		return pottentialDeliveryDate;
	}




	public void setPottentialDeliveryDate(String pottentialDeliveryDate) {
		this.pottentialDeliveryDate = pottentialDeliveryDate;
	}




	private int TotalPrice = 0;
	private String pottentialDeliveryDate = "";

	

	
	public void addsupplierorder() {
			SupplyOrder so = new SupplyOrder(1,status,suppliername,placedon,OrderItems,TotalPrice,pottentialDeliveryDate);
			System.out.println(so + "order created"); // for debugging
	}
	
	
}