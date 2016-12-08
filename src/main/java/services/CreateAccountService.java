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
		if (customer == null){
			return true;
		}
		if(customer.getEmail().equals(email))
			return false; // email already exists
		return	true; // email doesnt exist
	}

	public boolean emailRegistered(String email) {
		Customer customer = customerManager.findByEmail(email.toLowerCase());
		if(customer==null) return false;
		
		return false;
	}
}
