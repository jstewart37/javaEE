package controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Entitys.*;
import services.SupplyOrderService;

@Named("supplyOrderCon")
@ConversationScoped
public class SupplyOrderController implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7590914591253360042L;
	
	/**
	 * private static final SupplyOrder[] orderList = new SupplyOrder[] {
	
			
			new SupplyOrder(1, "Arrived", "2002-02-13 14:37:12", "2008-06-11 11:27:38")
		};
	 */
	@Inject
	private SupplyOrderService SupplyOrderService;

	@Inject
	private EntityManagers.SupplyOrderManager SupplyOrderManager;
	
	private List<SupplyOrder> supplyorderlist = null;
	
	public List<SupplyOrder> getsupplyorderlist() {
		supplyorderlist = SupplyOrderService.findAll();
		//System.out.println("there are " +supplyorderlist.size() + " supplier orders");
		return supplyorderlist;
	}

	private List<SupplyOrderLine> supplyorderlinelist = null;
	
	public List<SupplyOrderLine> getsupplyorderlinelist() {
		supplyorderlinelist = SupplyOrderService.findAllOL();
		//System.out.println("there are " +supplyorderlist.size() + " supplier orders");
		return supplyorderlinelist;
	}
	
	
	
}
