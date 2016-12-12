package EntityManagers;

import java.util.List;

import Entitys.Address;
import Entitys.Author;
import Entitys.Customer;
import Entitys.CustomerOrder;

/**
 * 
 * @author Jake_Stewart
 *
 */

public interface CustomerOrderManager {

	@Author(author="Ben")
	//query
	public static List<CustomerOrder> CustomerOrdersForCustomer(long customerID) {
		// TODO Auto-generated method stub
		return null;
	}
	public CustomerOrder CustomerOrderDetails(int customerOrderID);
	
	//CRUD 
	public void AddNewCustomerOrder(long idCustomerOrder, String status, long customerID,
			Address addressId, Address billingAddress, int cardNumber);
	
	public void AddNewCustomerOrderLine(CustomerOrder customerOrder);
	
	//public void findByCustomerId(long id);
	
	
}
