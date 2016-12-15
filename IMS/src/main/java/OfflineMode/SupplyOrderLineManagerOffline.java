package OfflineMode;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import EntityManagers.SupplyOrderLineManager;
import Entitys.Author;
import Entitys.SupplyOrder;
import Entitys.SupplyOrderLine;
import Entitys.TestData;

@Stateless
@Default
public class SupplyOrderLineManagerOffline implements SupplyOrderLineManager {
	@Inject
	private TestData testData;
	
	@Author(author="Jake")
	//the below method returns the list of the current orderliens in the test data then
	//it adds the user provided order line to this list of the test data.
	//the original test data is then reset to contain the new provided information
	//finally the newly added orderline (not the full list) is sent back through methods to be used.
	@Override
	public SupplyOrderLine createNewSupplyOrderLine(SupplyOrderLine supplyorderline, SupplyOrder so) {
		List<SupplyOrderLine> supplyorderlinelist = testData.getSupplyorderlinelist();
		//supplyorderline.setSupplyOrder(so);
		supplyorderlinelist.add(supplyorderline);
		testData.setSupplyorderlinelist(supplyorderlinelist);
		return supplyorderline;
	}

	//below method returns all of the order lines stored in the test data
	@Override
	public List<SupplyOrderLine> findAllOL() {
		return testData.getSupplyorderlinelist();
	}


	@Override
	public SupplyOrderLine readSupplyOrderLine(SupplyOrderLine supplyOrderLine) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public SupplyOrderLine readSupplyOrderline(SupplyOrderLine supplyorderline) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SupplyOrderLine updateSupplyOrderLine(SupplyOrderLine supplyorderline) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SupplyOrderLine deleteSupplyOrderLine(SupplyOrderLine supplyOrderLine) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SupplyOrderLine createNewSupplyOrderLine(SupplyOrderLine supplyOrderLine) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
