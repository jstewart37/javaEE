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
		if (!(customer == null))	//if customer is not null.
		{
			if (customer.getPassword() == password)
			{
				return true;
			}
			else
			{
				return false; //password is incorrect
			}
		}
		
		return	false; // customer is null.
	}

	public Customer loginUser(String email) {
		return customerManager.findByEmail(email.toLowerCase());
	}
}
