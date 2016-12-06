package services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import EntityManagers.CustomerManager;
import Entitys.Customer;
//@author Sophie
@Stateless
public class LoginService {
	@Inject
	private CustomerManager customerManager;

	public boolean validLogin(String email, String password) {
		Customer customer = customerManager.findByEmail(email.toLowerCase());
		if(customer==null)
			return false;
		return	true;
	}

	public Customer loginUser(String email) {
		return customerManager.findByEmail(email.toLowerCase());
	}
}
