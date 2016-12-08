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
@Named(value="usersession")
@SessionScoped
public class CurrentUser implements Serializable {

	/**
	 * 
	 */
	public String getName(){
		return customer.getName();
	}
	
	public String getEmail(){
		return customer.getEmail();
	}
	
	
	
	private static final long serialVersionUID = -2133248137329753396L;
	private Customer customer = null;

	public Customer getCustomer() {
		System.out.println(customer.getIdCustomer());
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public boolean isloggedIn(){
		System.out.println(customer.getIdCustomer());
		return (customer == null) ? false : true;
	}
	
}
