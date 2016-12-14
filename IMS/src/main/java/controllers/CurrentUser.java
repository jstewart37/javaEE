/**
 * 
 */
package controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import Entitys.Customer;
import Entitys.Staff;

/**
 * @author Vera
 *
 */
@Named(value="usersessionIMS")
@SessionScoped
public class CurrentUser implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = -2133248137329753396L;
	private Customer customer = null;
	private Staff staff = null;

	public Customer getCustomer() {
		if (customer == null)
			return new Customer();
		System.out.println(customer.getIdCustomer());
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;

	}
	
	public boolean isloggedIn(){
		return (customer == null) ? false : true;
	}
	
	
	public void setStaff(Staff staff){
		this.staff = staff;	
	}
	
	
	
	
	
}
