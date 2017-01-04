package OfflineMode;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import EntityManagers.CustomerManager;
import Entitys.Address;
import Entitys.Author;
import Entitys.CardDetails;
import Entitys.Customer;
import Entitys.TestData;



@Stateless
@Default
public class CustomerManagerOffline implements CustomerManager {
	@Inject
	private TestData testData;
	
	@Author(author="Ben")
	@Override
	public Customer findByEmail(String email) {
		for (Customer customer : testData.getCustomers()){
			if (customer.getEmail().equalsIgnoreCase(email))
				return customer;
		}
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
		List<Address> address = setAddress(customer.getIdCustomer());
		customer.setAddressList(address);
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

	@Override
	public List<Address> setAddress(long id) {
		List<Address> a = new ArrayList<>();
		a = testData.setEmptyAddress(id);
		return a;
	}

	@Override
	public List<CardDetails> setCard(String name) {
		List<CardDetails> c = new ArrayList<>();
		c = testData.setEmtpyCard(name);
		return c;
	}
	
	

}
