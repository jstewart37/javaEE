package OfflineMode;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.inject.Singleton;

import Entitys.*;

@Startup
@Singleton
public class CustomerOrderOffline {
	
	private List<Customer> customers;
	private List<CustomerOrder> customerOrders;
	private List<CustomerOrderLine> customerOrderLine;
	private List<Product> products;
	
	@PostConstruct
	private void setupData(){
		customers = new ArrayList<>();
		customerOrders = new ArrayList<>();
		customerOrderLine = new ArrayList<>();
		products = new ArrayList<>();
	}
	
}
