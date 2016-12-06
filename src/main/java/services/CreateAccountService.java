package services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import EntityManagers.CustomerManager;
import Entitys.Customer;

//@author Sophie
@Stateless
public class CreateAccountService {

	@Inject
	private CustomerManager customerManager;

	public boolean checkEmail(String email) {
		Customer customer = customerManager.findByEmail(email.toLowerCase());
		if(customer==null)
			return false;
		return	true;
	}

	public Customer emailRegistered(String email) {
		return customerManager.findByEmail(email.toLowerCase());
	}
}
