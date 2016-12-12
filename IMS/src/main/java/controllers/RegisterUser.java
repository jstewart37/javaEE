/**
 * 
 */
package controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import Entitys.Customer;

/**
 * @author Sophie
 *
 */
@Named(value="RegisterUser")
@SessionScoped
public class RegisterUser implements Serializable {

	private Customer customer = null;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer emailRegistered) {
		// TODO Auto-generated method stub
		
	}
	public void setCustomer(Object emailRegistered) {
		// TODO Auto-generated method stub
		
	}

	
	
	public boolean isRegistered(){
		return (customer==null)?true:false;
	}



}
