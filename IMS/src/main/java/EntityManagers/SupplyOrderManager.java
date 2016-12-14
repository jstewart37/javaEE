package EntityManagers;

import java.util.List;

import Entitys.SupplyOrder;
import Entitys.SupplyOrderLine;

public interface SupplyOrderManager {
	
	// CRUD stubs
	public SupplyOrder createNewSupplyOrder(SupplyOrder supplyorder);
	public SupplyOrder readSupplyOrder(SupplyOrder supplyorder);
	public SupplyOrder updateSupplyOrderr(SupplyOrder supplyorder);

	
	public List<SupplyOrder> findAll();
	public List<SupplyOrderLine> findAllOL();
}
