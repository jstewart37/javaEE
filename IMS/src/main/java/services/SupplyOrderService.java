package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import EntityManagers.SupplyOrderLineManager;
import EntityManagers.SupplyOrderManager;
import Entitys.SupplyOrder;
import Entitys.SupplyOrderLine;

@Stateless
public class SupplyOrderService {
	
	@Inject
	private SupplyOrderManager SupplyOrderManager;

	@Inject
	private SupplyOrderLineManager SupplyOrderLineManager;
	
	
	public List<SupplyOrder> findAll() {
		return SupplyOrderManager.findAll();
	}
	
	public List<SupplyOrderLine> findAllOL() {
		return SupplyOrderManager.findAllOL();
	}
	
	public SupplyOrder createNewSupplyOrder(SupplyOrder so){
		return so = SupplyOrderManager.createNewSupplyOrder(so);
	}
	
	public SupplyOrderLine createNewSupplyOrderLine(SupplyOrderLine sol){
		return SupplyOrderLineManager.createNewSupplyOrderLine(sol);
	}
	
	
}
