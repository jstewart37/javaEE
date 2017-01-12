package OfflineMode;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import EntityManagers.CustomerOrderLineManager;
import Entitys.CardDetails;
import Entitys.CustomerOrderLine;



/**
 * @Author(author="Jake_Stewart")
 */

@Stateless
@Default

public class CustomerOrderLineOffline implements CustomerOrderLineManager {

	@Override
	public CustomerOrderLine createNewCustomerOrderLine(CustomerOrderLine customerOrderLine) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerOrderLine updateCustomerOrderLine(CustomerOrderLine customerOrderLine) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerOrderLine removeCustomerOrderLine(CardDetails customerOrderLine) {
		// TODO Auto-generated method stub
		return null;
	}

}
