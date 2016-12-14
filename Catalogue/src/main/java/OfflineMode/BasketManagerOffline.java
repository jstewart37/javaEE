package OfflineMode;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import EntityManagers.BasketManager;
import Entitys.Customer;
import Entitys.Stock;
import Entitys.TestData;

@Stateless
@Default
public class BasketManagerOffline implements BasketManager {
	@Inject
	private TestData testData;

	@Override
	public List<Stock> findByCustomerId(long id) {
		for (Customer customer : testData.getCustomers())
			if (customer.getIdCustomer() == id)
				return customer.getBasketlist();
		return null;
	}

	@Override
	public void updateWishList(long customerId, List<Stock> wishlist) {
		List<Customer> customers = testData.getCustomers();
		for (Customer customer : customers)
			if (customer.getIdCustomer() == customerId)
				customer.setBasketlist(wishlist);
		testData.setCustomers(customers);
	}

	}

