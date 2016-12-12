package EntityManagers;

import Entitys.SupplierProducts;

public interface SupplierProductsManager {
	
	//query based stubs
	public SupplierProducts ProductSupplierName(String name);
	//CRUD based stubs
	public SupplierProducts createNewSupplierProduct(SupplierProducts supplierProducts);
	public SupplierProducts readSupplierProduct(SupplierProducts supplierProducts);
	public SupplierProducts updateSupplierProduct(SupplierProducts supplierProducts);
	public SupplierProducts deleteSupplierProducts(SupplierProducts supplierProducts);
}
