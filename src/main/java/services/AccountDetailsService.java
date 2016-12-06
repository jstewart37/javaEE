package services;

import java.util.ArrayList;

/**
 * @author Jake_Stewart
 */

import java.util.List;

import javax.ejb.Stateless;

import EntityManagers.*;
import Entitys.*;

@Stateless
public class AccountDetailsService {

	public List<CustomerOrder> findByid(long id) {
		List<CustomerOrder> results = new ArrayList<>();
		results.addAll(CustomerOrderManager.CustomerOrdersForCustomer(id));
		for(CustomerOrder co : CustomerOrderManager.CustomerOrdersForCustomer(id))
			
		return results;
		return results;
	}	
}