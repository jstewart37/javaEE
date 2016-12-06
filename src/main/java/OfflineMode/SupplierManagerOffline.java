/**
 * @Author(author="Alex")
 */

package OfflineMode;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import EntityManagers.SupplierManager;
import Entitys.Author;
import Entitys.Supplier;
import Entitys.TestData;







@Stateless
@Default
public class SupplierManagerOffline implements SupplierManager{

	@Inject
	private TestData testData;
	@Author(author="Alex")
	
	
	@Override
	public Supplier findSupplierName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Supplier findSupplierByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void findSupplierProducts(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findSupplierProducts(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Supplier readSupplier(Supplier supplier) {
		List<Supplier> suppliers = testData.getSuppliers();
		for(Supplier s : suppliers){
			if(s.getSupplierName() == ""){
					return supplier;
			}
		}
		return supplier;
	
	}

	@Override
	public Supplier updateSupplier(Supplier supplier) {
		List<Supplier> suppliers = testData.getSuppliers();
		for(Supplier s : suppliers){
			if(s.getSupplierName() == "Sophies Rude Ass Garden Supplies"){
				s.setSupplierName("Sophies issueless garden supplies..yes she's fixed");
			}
		}
		return supplier;
	}
	
	@Override
	public Supplier createNewSupplier(Supplier supplier) {
		List<Supplier> suppliers = testData.getSuppliers();
		suppliers.add(supplier);
		testData.setSuppliers(suppliers);		
		return supplier;
	}
	
	
	
	
	
	
	
}
