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
	private List<CustomerOrderLine> customerOrderLine;
	private List<CardDetails> cardDetails;

	@PostConstruct
	private void setupData() {

		supplyorderlist = new ArrayList<>();
		customers = new ArrayList<>();
		customerOrderLine=new ArrayList<>();
		cardDetails=new ArrayList<>();
		
		customers.add(new Customer(1, "mr", "Tom", "Mr.Tom@Movie.com", "12345678912"));
		customers.add(new Customer(1, "mr", "Tom", "Mr.T*m@M/vie.com", "1912"));
		
		customerOrderLine.add(new CustomerOrderLine(4, 2, 1, 2.99 ));
		cardDetails.add(new CardDetails("21-22-24", "01245879", "MISS G FARTWORTH", "1245789654785412", 2, 2));
	
		
		supplyorderlist.add(new SupplyOrder(1, "Arrived", "2002-02-13 14:37:12", "2008-06-11 11:27:38"));
		
	}

	public List<CardDetails> getCardDetails() {
		return cardDetails;
	}

	public void setCardDetails(List<CardDetails> cardDetails) {
		this.cardDetails = cardDetails;
	}

	public List<CustomerOrderLine> getCustomerOrderLine() {
		return customerOrderLine;
	}

	public void setCustomerOrderLine(List<CustomerOrderLine> customerOrderLine) {
		this.customerOrderLine = customerOrderLine;
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
