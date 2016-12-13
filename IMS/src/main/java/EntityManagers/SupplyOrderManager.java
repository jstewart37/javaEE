package EntityManagers;

import java.util.List;

import Entitys.SupplyOrder;

public interface SupplyOrderManager {
	
	// CRUD stubs
	public SupplyOrder createNewSupplyOrder(SupplyOrder supplyorder);
	public SupplyOrder readSupplyOrder(SupplyOrder supplyorder);
	public SupplyOrder updateSupplyOrderr(SupplyOrder supplyorder);

	
	public List<SupplyOrder> findAll();
}
