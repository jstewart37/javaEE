package OfflineMode;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import EntityManagers.BasketManager;
import Entitys.Customer;
import Entitys.Product;
import Entitys.Stock;
import Entitys.TestData;

@Stateless
@Default
public class BasketManagerOffline implements BasketManager {
	@Inject
	private TestData testData;

	@Override
	public List<Product> findByCustomerId(long id) {
		System.out.println("finding the customers current basket list");
		for (Customer customer : testData.getCustomers())
			if (customer.getIdCustomer() == id){
				System.out.println("RETURNING CUSTOMERS BASKET LIST TO SERVICE");
				return customer.getBasketlist();
			}
		System.out.println("returning to service with a null customer");
		return null;
	}
	
	

	@Override
	public void updateBasketList(long customerId, List<Product> basketList) {
		System.out.println("updating customer " + customerId + "with the new basket of size  " + basketList.size());
		List<Customer> customers = testData.getCustomers();
		for (Customer customer : customers)
			if (customer.getIdCustomer() == customerId){
			System.out.println("found customer number " + customerId +" THIS ID SHOULD BE THE SAME AS ABOVE.. time to set the their basket to the basket I have");
				customer.setBasketlist(basketList);
			}
		System.out.println("updating the testdata with the customers List the basketmanager owns.");
		testData.setCustomers(customers);
		}
		
		
		
		
	}


	

