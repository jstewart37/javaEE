package services;


import java.util.ArrayList;

/**
 * @author Jake_Stewart
 */

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.context.*;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.inject.Named;

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
