package OfflineMode;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.inject.Singleton;

import EntityManagers.CustomerOrderManager;
import Entitys.*;

@Startup
@Singleton
public class CustomerOrderOffline implements CustomerOrderManager {
	
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

	@Override
	public List<CustomerOrder> CustomerOrdersForCustomer(int customerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerOrder CustomerOrderDetails(int customerOrderID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void AddNewCustomerOrder(long idCustomerOrder, String status, long customerID, Address addressId,
			Address billingAddress, int cardNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AddNewCustomerOrderLine(CustomerOrder customerOrder) {
		// TODO Auto-generated method stub
		
	}
	
}
