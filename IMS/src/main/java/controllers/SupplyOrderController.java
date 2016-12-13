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

	@Inject
	private SupplyOrderService SupplyOrderService;

	@Inject
	private EntityManagers.SupplyOrderManager SupplyOrderManager;
	
	private List<SupplyOrder> supplyorderlist = null;
	
	public List<SupplyOrder> getsupplyorderlist() {
		supplyorderlist = SupplyOrderService.findAll();
		return supplyorderlist;
	}

	
}
