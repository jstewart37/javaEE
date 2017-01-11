package controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import EntityManagers.SupplyOrderManager;
import Entitys.SupplyOrder;
import Entitys.SupplyOrderLine;
import services.SupplyOrderService;

@Named("supplyOrderCon")
@ConversationScoped
public class SupplyOrderController implements Serializable {
	@Inject
	private SupplyOrderManager supplyOrderManager;
	@Inject
	private SupplyOrderService SupplyOrderService;

	/**
	 * 
	 */
	private static final long serialVersionUID = 7590914591253360042L;
	
	/**
	 * private static final SupplyOrder[] orderList = new SupplyOrder[] {
	
			
			new SupplyOrder(1, "Arrived", "2002-02-13 14:37:12", "2008-06-11 11:27:38")
		};
	 */
	
	

	private List<SupplyOrder> supplyorderlist = null;
	
	public List<SupplyOrder> getSupplyorderlist() {
		supplyorderlist = SupplyOrderService.findAll();
		System.out.println("there are " +supplyorderlist.size() + " supplier orders");;
    	System.out.println(supplyorderlist);
		return supplyorderlist;
	}
	private List<SupplyOrderLine> supplyorderlinelist = null;
	
	public List<SupplyOrderLine> getsupplyorderlinelist() {
		supplyorderlinelist = SupplyOrderService.findAllOL();
		//System.out.println("there are " +supplyorderlist.size() + " supplier orders");
		return supplyorderlinelist;
	}	
	
	@SuppressWarnings("null")
	public List<Long> getSupplyorderlistid(){
		supplyorderlist = SupplyOrderService.findAll();
		List<Long> Supplyorderlistid = null;
		
		for(SupplyOrder a : supplyorderlist )
		{
			Supplyorderlistid.add(a.getIdSupplyOrder());
			System.out.println(a.getIdSupplyOrder());		
		}
		return Supplyorderlistid; 
	}

    
	public void setSupplyorderlist(List<SupplyOrder> supplyorderlist) {
		this.supplyorderlist = supplyorderlist;
	}
	public List<SupplyOrderLine> getSupplyorderlinelist() {
		return supplyorderlinelist;
	}
	public void setSupplyorderlinelist(List<SupplyOrderLine> supplyorderlinelist) {
		this.supplyorderlinelist = supplyorderlinelist;
	}

	
	
}
