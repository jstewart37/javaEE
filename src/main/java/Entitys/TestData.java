package Entitys;

import java.util.*;

import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.inject.Singleton;

@Startup
@Singleton
public class TestData {

	private List<SupplyOrder> supplyorderlist;
	private List<Customer> customers;

	@PostConstruct
	private void setupData() {

		supplyorderlist = new ArrayList<>();
		customers = new ArrayList<>();
		
		customers.add(new Customer(1, "mr", "Tom", "Mr.Tom@Movie.com", "12345678912"));
		customers.add(new Customer(2, "mr", "Andy", "Mr.Andy@M/vie.com", "1912"));
		
		supplyorderlist.add(new SupplyOrder(1, "Arrived", "2002-02-13 14:37:12", "2008-06-11 11:27:38"));
		
	}

	public List<SupplyOrder> getSupplyorderlist() {
		return supplyorderlist;
	}

	public void setSupplyorderlist(List<SupplyOrder> supplyorderlist) {
		this.supplyorderlist = supplyorderlist;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	
}
