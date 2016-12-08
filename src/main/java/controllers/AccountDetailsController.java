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
	
	private Address address = null;
	
	
	

	private String addressLine1 = "";
	private String addressLine2 = "";
	private String county = "";
	private String city = "";
	private String postcode = "";
	
	
	
	
	public String getAddressLine1() {
		address = addressManager.findAddressByID(user.getCustomer().getIdCustomer());
		if (address.getAddressLine1() == null) return "NO";	
		return address.getAddressLine1();
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


	

}
