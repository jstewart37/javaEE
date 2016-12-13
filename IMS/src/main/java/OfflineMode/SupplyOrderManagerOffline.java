package OfflineMode;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import EntityManagers.SupplyOrderManager;
import Entitys.Author;
import Entitys.SupplyOrder;
import Entitys.TestData;

@Stateless
@Default
public class SupplyOrderManagerOffline implements SupplyOrderManager {
	@Inject
	private TestData testData;
	
	@Author(author="Ben")
	@Override
	public SupplyOrder createNewSupplyOrder(SupplyOrder supplyorder) {
		List<SupplyOrder> supplyorderlist = testData.getSupplyorderlist();
		supplyorder.setIdSupplyOrder(supplyorderlist.size() + 1);
		supplyorderlist.add(supplyorder);
		testData.setSupplyorderlist(supplyorderlist);
		return supplyorder;
	}

	@Override
	public SupplyOrder readSupplyOrder(SupplyOrder supplyorder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SupplyOrder updateSupplyOrderr(SupplyOrder supplyorder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SupplyOrder> findAll() {
		return testData.getSupplyorderlist();
	}
	
	

}
