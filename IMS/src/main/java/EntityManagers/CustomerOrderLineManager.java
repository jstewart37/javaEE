package EntityManagers;

import Entitys.CardDetails;
import Entitys.CustomerOrderLine;

public interface CustomerOrderLineManager {
	
	/**
	 * @Author(author="Jake")
	 */
	
	
	//CRUD Stubs
	public CustomerOrderLine createNewCustomerOrderLine(CustomerOrderLine customerOrderLine);
	public CustomerOrderLine updateCustomerOrderLine(CustomerOrderLine customerOrderLine);
	public CustomerOrderLine removeCustomerOrderLine(CardDetails customerOrderLine);
}
