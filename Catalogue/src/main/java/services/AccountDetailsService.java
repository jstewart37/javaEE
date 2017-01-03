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
	@Inject
	private AddressManager addressManager;
	@Inject
	private AccountDetailsService accountService;

	public List<Address> getAddressList(long id) {
		List<Address> addresses = new ArrayList<>();
		try{
			addressManager.findByCustomerId(id).forEach(address->{
				addresses.add(accountService.getAddress(address));	
			});
		} finally {}
		return addresses;
	}
		

	public void add(long id, String addressLine1, String addressLine2, String county, String city, String postcode) {
		List<Address> addresses = addressManager.findByCustomerId(id);
		if (addresses == null) {
			addresses = new ArrayList<Address>();
		}
		for (Address a : addresses)
			if (a.getId() == id) {

				addresses.add(addressManager.findAddressByID(id));
				addressManager.updateAddressList(id, addresses);
			}
	}
	
	public Address getAddress(Address a) {
		Address address = new Address();
		if (a!=null)
			address.addAddressInfo(a.getId(),a.getAddressLine1(),a.getAddressLine2(), a.getPostCode(),a.getCounty(), a.getCity());
		return address;
	}

}
