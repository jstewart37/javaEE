package OfflineMode;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import EntityManagers.CustomerManager;
import Entitys.Customer;
import Entitys.TestData;

@Stateless
@Default
public class CustomerManagerOffline implements CustomerManager {
	@Inject
	private TestData testData;

	@Override
	public Customer findByEmail(String email) {
		for (Customer customer : testData.getCustomers())
			if (customer.getEmail().equalsIgnoreCase(email))
				return customer;
		return null;
	}

	@Override
	public Customer searchByItem(String search) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer createNewCustomer(Customer customer) {
		List<Customer> customers = testData.getCustomers();
		customer.setIdCustomer(customers.size() + 1);
		customers.add(customer);
		testData.setCustomers(customers);
		return findByEmail(customer.getEmail());
	}

	@Override
	public Customer readCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		List<Customer> customers = testData.getCustomers();
		for(Customer c : customers){
			if(c.getName() == "Andy"){
				c.setName("Paul");
			}
		}
		return customer;
	}

}
