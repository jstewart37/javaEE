package OfflineMode;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import EntityManagers.CustomerOrderLineManager;
import Entitys.CardDetails;
import Entitys.CustomerOrderLine;
import Entitys.TestData;


/**
 * @Author(author="Jake_Stewart")
 */

@Stateless
@Default

public class CustomerOrderLineOffline implements CustomerOrderLineManager {
	@Inject
	private TestData testData;

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
