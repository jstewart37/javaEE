package EntityManagers;

import Entitys.Customer;

public interface CustomerManager {

	// named query stubs
	public Customer findByEmail(String email);
	public Customer searchByItem(String search);

	// CRUD stubs
	public Customer createNewCustomer(Customer customer);
	public Customer readCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);

}
