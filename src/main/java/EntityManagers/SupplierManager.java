package EntityManagers;

import Entitys.Address;
import Entitys.Supplier;

public interface SupplierManager {

	// query based stubs
	public Supplier findSupplierName(String name);
	public Supplier findSupplierByEmail(String email);
		
	//CRUD based stubs
	public Supplier createNewSupplier(Supplier supplier);
	public Supplier readAddress(Supplier supplier);
	public Supplier updateAddress(Supplier supplier);
	
	
}