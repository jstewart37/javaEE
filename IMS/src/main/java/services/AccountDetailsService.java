package services;




/**
 * @author Jake_Stewart
 */

import javax.ejb.Stateless;
import EntityManagers.*;
import Entitys.*;


@Stateless

public class AccountDetailsService {
	
	private CustomerManager customerManager;

	public  Customer findByemail(String Email) {
		
		Customer customer = customerManager.findByEmail(Email.toLowerCase());
			
		return customer;
		
	}	
}
