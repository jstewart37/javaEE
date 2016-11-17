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
	private List<Supplier> suppliers;

	@PostConstruct
	private void setupData() {
		suppliers = new ArrayList<>();
		supplyorderlist = new ArrayList<>();
		customers = new ArrayList<>();
		
		customers.add(new Customer(1, "mr", "Tom", "Mr.Tom@Movie.com", "12345678912"));
		customers.add(new Customer(1, "mr", "Tom", "Mr.T*m@M/vie.com", "1912"));
		
		supplyorderlist.add(new SupplyOrder(1, "Arrived", "2002-02-13 14:37:12", "2008-06-11 11:27:38"));
		
		suppliers.add(new Supplier(1, "Daves GGGGGGGGGGGGGGGGGGnomes", "07984682330", "dg@gnomies.com"));
		suppliers.add(new Supplier(2, "Sophies Rude Ass Garden Supplies", "07984643", "sg@rudegardensupplies.com"));
		
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

	public List<Supplier> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(List<Supplier> suppliers2) {
		this.suppliers = suppliers2;
		
	}

	
}
