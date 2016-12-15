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
	public List<SupplyOrderLine> findAll();
	public SupplyOrderLine readSupplyOrderline(SupplyOrderLine supplyorderline);
	public SupplyOrderLine createNewSupplyOrderLine(SupplyOrderLine sol, SupplyOrder so);
}
