package Entitys;



import java.util.*;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * @Author(author="All Team Members")
 */

@Startup
@Singleton
public class TestData { //class was created by entire team, see comments/annotations for individuals

	private List<SupplyOrder> supplyorderlist;
	private List<Customer> customers;
	private List<CustomerOrderLine> customerOrderLine;
	private List<Supplier> suppliers;
	private List<Address> addresses;
	private List<Product> products;



	@PostConstruct
	private void setupData() {
		suppliers = new ArrayList<>();
		supplyorderlist = new ArrayList<>();
		customers = new ArrayList<>();
		addresses = new ArrayList<>();
		customerOrderLine = new ArrayList<CustomerOrderLine>();
		customers.add(new Customer(1, "mr", "Tom", "Mr.Tom@Movie.com", "password","12345678912"));
		customers.add(new Customer(1, "mr", "Andy", "Mr.Andy@M/vie.com", "twat","1912"));
		
		customerOrderLine.add(new CustomerOrderLine(8, 10, 8, 24.89));
		
		supplyorderlist.add(new SupplyOrder(1, "Arrived", "2002-02-13 14:37:12", "2008-06-11 11:27:38"));
		
		//Alex's data
		suppliers.add(new Supplier(1, "Daves GGGGGGGGGGGGGGGGGGnomes", "07984682330", "dg@gnomies.com")); 
		suppliers.add(new Supplier(2, "Sophies Rude Ass Garden Supplies", "07984643", "sg@rudegardensupplies.com"));
		addresses.add(new Address(1, "65 Anchorage Quay", "eccles", "M27 641", "Greater Manchester", "Manchester"));
		addresses.add(new Address(1, "1 Someplace", "M64 813", "Greater Manchester", "Manchester"));
		
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
	@Author(author="Alex")
	public List<Supplier> getSuppliers() {
		return suppliers;
	}
	@Author(author="Alex")
	public void setSuppliers(List<Supplier> suppliers2) {
		this.suppliers = suppliers2;
		
	}

	public List<Product> getProducts() {
		return products;
	}
	@Author(author="Alex")
	public List<Address> getAddresses() {
		return addresses;
	}
	@Author(author="Alex")
	public void setAddresses(List<Address> address) {
		this.addresses = address;
		
	}

}
