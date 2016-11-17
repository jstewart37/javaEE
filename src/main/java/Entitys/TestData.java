package Entitys;

import java.util.*;

import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.inject.Singleton;

@Startup
@Singleton
public class TestData {

	private List<Product> products;
	private List<Customer> customers;

	@PostConstruct
	private void setupData() {

		products = new ArrayList<>();
		customers = new ArrayList<>();
		
		customers.add(new Customer(1, "mr", "Tom", "Mr.Tom@Movie.com", "12345678912"));
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	
}
