package controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import EntityManagers.SupplyOrderManager;
import Entitys.Supplier;
import Entitys.SupplyOrder;
import services.SupplyOrderService;
import OfflineMode.SupplyOrderManagerOffline;

//@Author Jake
@RequestScoped
@Named(value = "addorder")
public class CreateOrderController {
	@Inject
	private SupplyOrderManager supplyOrderManager;
	
	@Inject
	private SupplyOrderService SupplyOrderService;

	private String status = "Placed";
	private Supplier supplier = null;
	private String placedon = "";
	private String orderItems = "No Items placed";
	private int TotalPrice = 0;
	private String pottentialDeliveryDate = "";

	

	public void addsupplierorder() {
		//needs work
		if(supplier!=null) {
			SupplyOrder so = new SupplyOrder(orderItems, supplier);
			so = SupplyOrderService.createNewSupplyOrder(so);
			System.out.println(so.getIdSupplyOrder());
			System.out.println(so + "order created"); // for debugging
			
			
			
			
			
			
		}
		System.out.println("No Supplier");
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Supplier getSupplier() {
		if(supplier==null)
			supplier=new Supplier();
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		if(supplier==null)
			supplier=new Supplier();
		this.supplier = supplier;
	}

	public String getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(String orderItems) {
		this.orderItems = orderItems;
	}

	public String getPlacedon() {
		return placedon;
	}

	public void setPlacedon(String placedon) {
		this.placedon = placedon;
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