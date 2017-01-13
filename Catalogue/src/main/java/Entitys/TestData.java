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
	public void setupData() {
		suppliers = new ArrayList<>();
		supplyorderlist = new ArrayList<>();
		customers = new ArrayList<>();
		addresses = new ArrayList<Address>();
		products = new ArrayList<>();
		customerOrderLine = new ArrayList<CustomerOrderLine>();

		

		customers.add(new Customer(1, "mr", "Tom", "Mr.Tom@Movie.com", "password","12345678912", "1991-12-22", setEmptyAddress(1), setEmtpyCard(1)));
		customers.add(new Customer(2, "mr", "Andy", "Mr.Andy@M/vie.com", "twig","1912", "1991-12-22", setEmptyAddress(2), setEmtpyCard(2)));
		
		customerOrderLine.add(new CustomerOrderLine(8, 10, 8, 24.89));
		
		supplyorderlist.add(new SupplyOrder(1, "Arrived", "2002-02-13 14:37:12", "2008-06-11 11:27:38"));
		
		//Alex's data
		suppliers.add(new Supplier(1, "Daves GGGGGGGGGGGGGGGGGGnomes", "07984682330", "dg@gnomies.com")); 
		suppliers.add(new Supplier(2, "gnomie gnomie", "07984643", "gg@gg.com"));
	
		//Daves data
		products.add(new Product(1, "Gandalf Gnome", "A Gandalf themed Gnome", "Grey", 25, 9.99, 5.99, "available", "img/gandalf.jpg" , "yes", "gnome"));
		products.add(new Product(2, "Goku Gnome", "A gnome from the Saiyan race", "multi", 50, 9.99, 5.99, "available", "img/goku.png", "yes" , "gnome"));
		products.add(new Product(3, "Colossal Gnome", "A humongous humanoid Gnome with no skin", "red", 15, 59.99, 25.99, "available", "img/col.jpg", "yes" , "furniture"));
		products.add(new Product(4, "Hulk Gnome", "You wont like him when hes angry", "Green", 45, 9.99, 5.99, "discontinued", "img/hulk.png", "no" , "gnome"));
		products.add(new Product(5, "Darth Vader Gnome", "Biggest, baddest sith lord", "Black", 15, 9.99, 5.99, "available", "img/darth.png", "yes" , "gnome"));
		products.add(new Product(6, "Rick Sanchez Gnome", "Wubbalubba dubb dubb", "White", 21, 9.99, 5.99, "available", "img/rick.png", "yes" , "gnome"));
		products.add(new Product(7, "Red Gnome", "Gnome with red hat and clothing", "Red", 27, 9.99, 5.99, "discontinued", "img/redgnome.jpg", "yes" , "gnome"));
		products.add(new Product(8, "Green Gnome", "Gnome green with hat and clothing", "Green", 56, 9.99, 5.99, "available", "img/green.jpg", "yes" , "gnome"));
		products.add(new Product(9, "Blue Gnome", "Gnome with blue hat and clothing", "Blue", 28, 9.99, 5.99, "available", "img/samuel.jpg", "yes" , "gnome"));
		products.add(new Product(10, "Santa", "St nicholas themed ", "Red", 46, 9.99, 5.99, "available", "img/santa.jpg", "yes" , ""));
		products.add(new Product(11, "Gnome Gnome", "Gnome Gnome Gnome Gnome Gnome Gnome", "Gnome", 35, 9.99, 5.99, "available", "img/gnome.jpg", "no" , "gnome"));
		products.add(new Product(12, "Weird Chair", "Wicker, but comfy", "brown", 10000, 159, 0.1, "available", "img/chair.jpg", "no", "furniture"));



		products.add(new Product(13, "Gnome weightlifter", "can do 100 dips", "white", 10000, 159, 0.1, "available", "img/weightliftingGnome.jpg", "no", "other"));

		
		
	
		
	}
	
	public List<CardDetails> setEmtpyCard(long id) {
		List<CardDetails> a = new ArrayList<>();
		a.add(new CardDetails(id, "Please add card", "Please add card", "Please add card"));
		return a;
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
	
	public List<Address> setEmptyAddress(long id){
		List<Address> a = new ArrayList<>();
		a.add(new Address(id, "Please add address", "Please add address","Please add address", "Please add address ","Please add address"));
		return a;
	
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
