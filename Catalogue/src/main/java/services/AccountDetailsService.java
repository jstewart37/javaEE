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
	@Inject
	private CardDetailsManager cardManager;

	public List<Address> getAddressList(long id) {
		List<Address> addresses = new ArrayList<>();
		try{
			System.out.println("trying in the accountDetailService to use the addressmanager to find all the addresses for this customer");
			addressManager.findByCustomerId(id).forEach(address->{				
				addresses.add(accountService.getAddress(address));		
				});
		} catch(Exception e) {
			System.out.println("the account details service exploded when trying to retrieve the customers address list.");
		}
		return addresses;
	}
		

	@SuppressWarnings("null")
	public void add(long id, String addressLine1, String addressLine2, String county, String city, String postcode) {
		List<Address> addresses = addressManager.findByCustomerId(id); // finds all addresses associated with the customer
		List<Address> updatedAddresses = new ArrayList<Address>();
		if (addresses == null) {
			addresses = new ArrayList<Address>();
		}
		for (Address a : addresses){
			if(a.getAddressLine1().equalsIgnoreCase("default addressline 1"))	break;
			updatedAddresses.add(a);
			}
		updatedAddresses.add(new Address(id, addressLine1, addressLine2, county, city, postcode));
		addressManager.updateAddressList(id, updatedAddresses);
	}
	
	public Address getAddress(Address a) {
		Address address = new Address();
		if (a!=null)
			address.addAddressInfo(a.getId(),a.getAddressLine1(),a.getAddressLine2(), a.getPostCode(),a.getCounty(), a.getCity());
		return address;
	}


	public List<CardDetails> getCardList(long idCustomer) {
		List<CardDetails> cards = new ArrayList<>();
		System.out.println("step 3");
		try{
			
			cardManager.findByCustomerId(idCustomer).forEach(card->{				
				cards.add(accountService.getCard(card));		
				});
		} catch(Exception e) {
			System.out.println("something went wrong in accountDetailsService to do with banking information");
		}
		return cards;
	}
	
	public CardDetails getCard(CardDetails c) {
		CardDetails card = new CardDetails();
		if (c!=null)
			card.addCardInfo(c.getCustomerID(),c.getAccountNumber()	,c.getCardNumber(), c.getNameOnCard(), c.getSortCode());
		return card;
	}

}
