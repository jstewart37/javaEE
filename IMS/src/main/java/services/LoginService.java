package services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import EntityManagers.CustomerManager;
import EntityManagers.StaffManager;
import Entitys.Customer;
import Entitys.Staff;

//@author Vera
@Stateless
public class LoginService {
	@Inject
	private CustomerManager customerManager;
	@Inject
	private StaffManager staffManager;
	
	
	

	public boolean validLogin(String email, String password) {
		Customer customer = customerManager.findByEmail(email.toLowerCase());
		if (!(customer == null))	//if customer is not null.
		{
			if (customer.getPassword().equals(password))
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

	public Customer getEmail(String email) {
		return customerManager.findByEmail(email.toLowerCase());
	}
	
	
	public Staff getUsername(String username) {
		return staffManager.findByUsername(username.toLowerCase());
	}
	
	public boolean validLoginIMS(String username, String password) {
		Staff staff = staffManager.findByUsername(username.toLowerCase());
		if (!(staff == null))	//if staff is not null.
		{
			if (staff.getPassword().equals(password))
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

	
	
	
	
	
	
	
	
	
	
	
	
}
