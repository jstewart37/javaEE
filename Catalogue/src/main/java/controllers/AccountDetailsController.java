package controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.*;
import javax.inject.Inject;
import javax.inject.Named;

import EntityManagers.AddressManager;
import Entitys.*;
import OfflineMode.AddressManagerOffline;
import services.AccountDetailsService;

/**
 * @author Jake_Stewart
 *
 */

@SessionScoped
@Named("AccountDetails")
public class AccountDetailsController implements Serializable {
	@Inject
	private CurrentUser user;
	@Inject
	private AddressManager addressManager;
	
	private List<Address> addresses = null;
	
	
	
	private long id;
	private String addressLine1 = "";
	private String addressLine2 = "";
	private String county = "";
	private String city = "";
	private String postcode = "";
	
	
	public List<Address> getAllAddresses(){
		addresses = addressManager.findAllAddressesByID(user.getCustomer().getIdCustomer());
		return addresses;
	}
	
/**	public String getAddressLine1() {
		addresses.
		if (address == null) return "NO";	
		return addresses.getAddressLine1();
	}
	
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		address = addressManager.findAddressByID(user.getCustomer().getIdCustomer());
		if (address == null) return "NO";
		return address.getAddressLine2();
	
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCounty() {
		address = addressManager.findAddressByID(user.getCustomer().getIdCustomer());
		if (address == null) return "NO";
		return address.getCounty();
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getCity() {
		address = addressManager.findAddressByID(user.getCustomer().getIdCustomer());
		if (address == null) return "NO";
		return address.getCity();
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostcode() {
		address = addressManager.findAddressByID(user.getCustomer().getIdCustomer());
		if (address == null) return "NO";
		return address.getPostCode();
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}


	public String addAddress(){
		this.id = user.getCustomer().getIdCustomer();
			addressManager.createNewAddress(new Address(id, addressLine1, addressLine2, postcode, county, city));
			return "accountdetails";
	}

*/

	public String add(){
			accountService.add(user.getCustomer().getIdCustomer(), addressLine1, addressLine2, county, city, postcode);
		return "accountdetails";
	}
	

}
