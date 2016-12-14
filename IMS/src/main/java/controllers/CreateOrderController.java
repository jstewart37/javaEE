package controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import EntityManagers.SupplyOrderManager;
import Entitys.SupplyOrder;

//@Author Jake
@RequestScoped
@Named(value = "addorder")
public class CreateOrderController {
	@Inject
	private SupplyOrderManager supplyManager;
	
	private String status = "Placed";
	private int supplierID = 0;
	private String placedon = "";
	private String orderItems = "";
	private int TotalPrice = 0;
	private String pottentialDeliveryDate = "";

	

	public void addsupplierorder() {
		//needs work
			SupplyOrder so = new SupplyOrder(orderItems, supplierID);
			SupplyOrder so = new SupplyOrder
		
			System.out.println(so + "order created"); // for debugging
	}

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


	

	
	
}