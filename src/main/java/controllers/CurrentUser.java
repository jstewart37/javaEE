/**
 * 
 */
package controllers;

import java.io.Serializable;

import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import Entitys.Customer;

/**
 * @author Sophie
 *
 */
@Named(value="currentUser")
@SessionScoped
public class CurrentUser implements Serializable {

	private Customer customer = null;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public boolean isloggedIn(){
		if (customer == null) return false;
		return true;
	}
	
	
}
