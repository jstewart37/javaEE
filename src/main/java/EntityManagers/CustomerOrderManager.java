package EntityManagers;

import java.util.List;

import Entitys.Address;
import Entitys.CardDetails;
import Entitys.CustomerOrder;

public interface CustomerOrderManager {

	
	//query
	public List<CustomerOrder> CustomerOrdersForCustomer(int customerID);
	public CustomerOrder CustomerOrderDetails(int customerOrderID);
	
	//CRUD 
	public void AddNewCustomerOrder(long idCustomerOrder, String status, long customerID,
			Address addressId, Address billingAddress, int cardNumber);
	
	public void AddNewCustomerOrderLine(CustomerOrder customerOrder);
	
	
}
