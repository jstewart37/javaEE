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
	private String SupplierName = "";
	private String OrderPlacedDate = "";
	private String OrderItems = "";
	private int TotalPrice = 0;
	private String pottentialDeliveryDate = "";

	public String getSupplierName() {
		return SupplierName;
	}
	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}
	public String getOrderPlacedDate() {
		return OrderPlacedDate;
	}
	public void setOrderPlacedDate(String orderPlacedDate) {
		OrderPlacedDate = orderPlacedDate;
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

	
	public void registerCustomer() {
			SupplyOrder so = new SupplyOrder(1,status,SupplierName,OrderPlacedDate,OrderItems,TotalPrice,pottentialDeliveryDate);
			System.out.println(so + "order created"); // for debugging
	}
	
	
}