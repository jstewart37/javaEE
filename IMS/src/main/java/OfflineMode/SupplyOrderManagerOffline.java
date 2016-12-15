package OfflineMode;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import EntityManagers.SupplyOrderManager;
import Entitys.Author;
import Entitys.SupplyOrder;
import Entitys.SupplyOrderLine;
import Entitys.TestData;

@Stateless
@Default
public class SupplyOrderManagerOffline implements SupplyOrderManager {
	@Inject
	private TestData testData;
	
	//@Author(author="Jake")
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	
	@Author(author="Ben & Jake")
	@Override
	public SupplyOrder createNewSupplyOrder(SupplyOrder supplyorder) {
		List<SupplyOrder> supplyorderlist = testData.getSupplyorderlist();
		supplyorder.setIdSupplyOrder(supplyorderlist.size() + 1); 				//gets the current size of the supply order list and adds one to ensure the ID's are incrementing
		supplyorder.setDateTimePlaced(String.format(dateFormat.format(date)));	//sets the date placed as the current  timestamp
		supplyorder.setDateTimeRecieved("N/A");									//sets the date recieved as "n/A"
		supplyorder.setStatus("Placed");										//sets the default status to be "placed"
		supplyorderlist.add(supplyorder);
		testData.setSupplyorderlist(supplyorderlist);
		return supplyorder;
	}

	
	@Override
	public List<SupplyOrder> findAll() {
		return testData.getSupplyorderlist();
	}

	//the below methods gets fed in the user inputed ID then uses this to match it to a supply order
	//then the matched order is returned.
	public SupplyOrder findbyID(int POID){
		List<SupplyOrder> allsupplyorders = testData.getSupplyorderlist();
		
		for(SupplyOrder so : allsupplyorders){
			if (so.getIdSupplyOrder() == POID)
					return so;
		}
		return null;
		
	}
	@Override
	public SupplyOrder readSupplyOrder(SupplyOrder supplyorder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SupplyOrder updateSupplyOrderr(SupplyOrder supplyorder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SupplyOrderLine> findAllOL() {
		// TODO Auto-generated method stub
		return null;
	}
}
