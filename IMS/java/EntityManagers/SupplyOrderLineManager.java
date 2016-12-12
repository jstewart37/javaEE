package EntityManagers;


import Entitys.SupplyOrderLine;

public interface SupplyOrderLineManager {
	
	//CRUD based stubs 
	public SupplyOrderLine createNewSupplyOrderLine(SupplyOrderLine supplyOrderLine);
	public SupplyOrderLine readSupplyOrderLine(SupplyOrderLine supplyOrderLine);
	public SupplyOrderLine updateSupplyOrderLine(SupplyOrderLine supplyOrderLine);
	public SupplyOrderLine deleteSupplyOrderLine(SupplyOrderLine supplyOrderLine);
}
