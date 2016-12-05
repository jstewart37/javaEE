package EntityManagers;

import Entitys.Author;
import Entitys.Supplier;

public interface SupplierManager {
	@Author(author="Alex")
	// query based stubs
	public Supplier findSupplierName(String name);
	public Supplier findSupplierByEmail(String email);
	public void findSupplierProducts(String name);
	public void findSupplierProducts(long id);

		
	//CRUD based stubs
	public Supplier createNewSupplier(Supplier supplier);
	public Supplier readSupplier(Supplier supplier);
	public Supplier updateSupplier(Supplier supplier);
	
	
}
