/**
 * 
 */
package controllers;

import java.io.Serializable;

import javax.enterprise.context.*;
import javax.inject.Named;


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

	return "Jake Stewart";
	//return CustomerName;
	
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
	
	

