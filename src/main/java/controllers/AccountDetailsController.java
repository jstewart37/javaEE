/**
 * 
 */
package controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.*;
import javax.inject.Named;

import Entitys.*;
import services.AccountDetailsService;


/**
 * @author Jake_Stewart
 *
 */

@SessionScoped
@Named("AccountDetails")
public class AccountDetailsController implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public String getReturnname(){
	
	//String CustomerName = AccountDetailsService.searchBy(email);

	Customer c = new Customer();
	
	String CName = c.getName();
	return "Jake Stewart"; //CName
	//return CustomerName;
	
}


public ArrayList<CustomerOrder> ARCustomerOrders(){
	ArrayList<CustomerOrder> COList = new ArrayList<CustomerOrder>();
	COList.add( new CustomerOrder(1, "55", 1, "55", "55", "55", 1)); 
//	COList.add("World");

	return COList;
}

public ArrayList<CustomerOrder> orders(){
	AccountDetailsController ac = new AccountDetailsController();
	ArrayList<CustomerOrder> COList = ac.ARCustomerOrders();
	return COList;
	
}

public String getemail(){
	
	
	
	
	return "jake.stewart@gmail.com";
}  

public String getaddressline1(){
	return " 4 anchorage quay";
}

public String getaddressline2(){
	return " Media City";
}
public String getcounty(){
	return " greater Manchester";
}

public String getcity(){
	return "salford";
}

public String getpostcode(){
	return "M6 4PO";
}


}	
	
	

