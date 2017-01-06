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
			addressManager.findByCustomerId(id).forEach(address->{				
				addresses.add(accountService.getAddress(address));		
				});
		} catch(Exception e) {
		}
		return addresses;
	}
		

	@SuppressWarnings("null")
	public void addAddress(long id, String addressLine1, String addressLine2, String county, String city, String postcode) {
		List<Address> addresses = addressManager.findByCustomerId(id); // finds all addresses associated with the customer
		List<Address> updatedAddresses = new ArrayList<Address>();
		if (addresses == null) {
			addresses = new ArrayList<Address>();
		}
		for (Address a : addresses){
						if(a.getAddressLine1().equalsIgnoreCase("Please add address"))	break;
			updatedAddresses.add(a);
			}
		updatedAddresses.add(new Address(id, addressLine1, addressLine2, county, city, postcode));
		addressManager.updateAddressList(id, updatedAddresses);
	}
	
	@SuppressWarnings("null")
	public void addCard(long id, String name, String cardNumber, String sortCode ) {
		List<CardDetails> cards = cardManager.findByCustomerId(id); // finds all cards associated with the customer
		List<CardDetails> updatedCards = new ArrayList<CardDetails>();
		if (cards == null) {
			cards = new ArrayList<CardDetails>();
		}
		for (CardDetails c : cards){
						if(c.getCardNumber().equalsIgnoreCase("Please add card"))	break; // if the default card is present dont add the old cards to the new list
			updatedCards.add(c);
			}
		updatedCards.add(new CardDetails(id, name, cardNumber, sortCode));
		cardManager.updateCardList(id, updatedCards);
	}
	
	
	
	public Address getAddress(Address a) {
		Address address = new Address();
		if (a!=null)
			address.addAddressInfo(a.getId(),a.getAddressLine1(),a.getAddressLine2(), a.getPostcode(),a.getCounty(), a.getCity());
		return address;
	}
	
	
	public List<CardDetails> getCardList(long idCustomer) {
		List<CardDetails> cards = new ArrayList<>();
		try{	
			cardManager.findByCustomerId(idCustomer).forEach(card->{				
				cards.add(accountService.getCard(card));		
				});
		} catch(Exception e) {
			System.out.println("THIS IS THE PROBLEM BIT");
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
