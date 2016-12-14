package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import EntityManagers.SupplyOrderManager;
import Entitys.SupplyOrder;

@Stateless
public class SupplyOrderService {
	
	@Inject
	private SupplyOrderManager SupplyOrderManager;

	
	public List<SupplyOrder> findAll() {
		return SupplyOrderManager.findAll();
	}
	
	public void createNewSupplyOrder(SupplyOrder so){
		SupplyOrderManager.createNewSupplyOrder(so);
	}
	
}
