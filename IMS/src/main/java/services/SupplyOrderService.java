package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import EntityManagers.SupplyOrderLineManager;
import EntityManagers.SupplyOrderManager;
import Entitys.SupplyOrder;
import Entitys.SupplyOrderLine;
// Author: Jake
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
		return SupplyOrderLineManager.findAllOL();
	}
	
	public SupplyOrder createNewSupplyOrder(SupplyOrder so){
		return so = SupplyOrderManager.createNewSupplyOrder(so);
	}
	
	public SupplyOrderLine createNewSupplyOrderLine(SupplyOrderLine sol){
		return SupplyOrderLineManager.createNewSupplyOrderLine(sol);
	}

	public SupplyOrderLine createNewSupplyOrderLine(SupplyOrderLine sol, SupplyOrder so) {
		return SupplyOrderLineManager.createNewSupplyOrderLine(sol,so);
		}
		
}
