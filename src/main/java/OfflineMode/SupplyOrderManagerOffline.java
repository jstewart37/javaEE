package OfflineMode;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import EntityManagers.SupplyOrderManager;
import Entitys.*;


@Stateless
@Default
public class SupplyOrderManagerOffline implements SupplyOrderManager {
	@Inject
	private TestData testData;
	

	@Override
	public SupplyOrder createNewSupplyOrder(SupplyOrder supplyorder) {
		// TODO Auto-generated method stub
		return null;
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
	
	

}
