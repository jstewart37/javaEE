package EntityManagers;


import java.util.List;

import Entitys.SupplyOrder;
import Entitys.SupplyOrderLine;

public interface SupplyOrderLineManager {
	
	//CRUD based stubs 
	public SupplyOrderLine createNewSupplyOrderLine(SupplyOrderLine supplyOrderLine);
	public SupplyOrderLine readSupplyOrderLine(SupplyOrderLine supplyOrderLine);
	public SupplyOrderLine updateSupplyOrderLine(SupplyOrderLine supplyOrderLine);
	public SupplyOrderLine deleteSupplyOrderLine(SupplyOrderLine supplyOrderLine);
	public SupplyOrderLine readSupplyOrderline(SupplyOrderLine supplyorderline);
	public SupplyOrderLine createNewSupplyOrderLine(SupplyOrderLine sol, SupplyOrder so);
	List<SupplyOrderLine> findAllOL();
}
