package controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.*;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
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
	@Inject
	private AccountDetailsService accountService;
	
	private List<Address> addresses = null;
	
	private PaginationHelper pagination = null;
	
	private long id;
	private String addressLine1 = "";
	private String addressLine2 = "";
	private String county = "";
	public long getId() {
		return id;
	}


	public String getAddressLine1() {
		return addressLine1;
	}


	public String getAddressLine2() {
		return addressLine2;
	}


	public String getCounty() {
		return county;
	}


	public String getCity() {
		return city;
	}


	public String getPostcode() {
		return postcode;
	}

	private String city = "";
	private String postcode = "";
	
	
	
	private void recreateModel() {
		addresses = null;
	}
	
	
	public List<Address> getAllAddresses(){
		addresses = addressManager.findAllAddressesByID(user.getCustomer().getIdCustomer());
		return addresses;
	}
	
	public PaginationHelper getPagination() {
		if (pagination == null) {
			System.out.println("pagination is null");
			pagination = new PaginationHelper(9) {
				
				@Override
				public int getItemsCount() {
					System.out.println("off to accountService to find all the addresses associated with this account.");
	
					return accountService.getAddressList(user.getCustomer().getIdCustomer()).size();
				}
				
				@Override
				public ListDataModel<Address> createPageDataModel() {
					try {
						System.out.println("trying to return a new datamodel");
						return new ListDataModel<Address>(accountService.getAddressList(user.getCustomer().getIdCustomer()).subList(getPageFirstItem(),
								getPageFirstItem() + getPageSize()));
					} catch (Exception e) {
						return new ListDataModel<Address>(
								accountService.getAddressList(user.getCustomer().getIdCustomer()).subList(getPageFirstItem(), getItemsCount()));
					}
				}
			};
		}
		return pagination;
	}
	
	public String next() {
		getPagination().nextPage();
		recreateModel();
		return "accountdetails";
	}

	public String previous() {
		getPagination().previousPage();
		recreateModel();
		return "accountdetails";
	}

	public List<Address> getAddresses() {
		addresses = accountService.getAddressList(user.getCustomer().getIdCustomer());
		return addresses;
	}
	
	
	@SuppressWarnings("unchecked")
	public DataModel<Address> getDataModel() {
		System.out.println("getting a datamodel. lets go to the pagination");
		return (DataModel<Address>) getPagination().createPageDataModel();
	}
	
	public String add(){
		if(user.isloggedIn())
			accountService.add(user.getCustomer().getIdCustomer(), addressLine1, addressLine2, county, city, postcode);
		return "accountdetails";
	}
	



}
