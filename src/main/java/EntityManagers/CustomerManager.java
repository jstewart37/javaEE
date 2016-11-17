package EntityManagers;

import Entitys.Customer;

public interface CustomerManager {

	// named query stubs
	public Customer findByEmail(String email);
	public Customer searchByItem(String search);

	// CRUD stubs
	public Customer createEmail(Customer customer);
	public Customer createTitle(Customer customer);
	public Customer createName(Customer customer);
	public Customer createPhone(Customer customer);
}
