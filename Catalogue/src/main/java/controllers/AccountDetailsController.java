package controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.*;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import EntityManagers.AddressManager;
import EntityManagers.CardDetailsManager;
import Entitys.*;
import OfflineMode.AddressManagerOffline;
import services.AccountDetailsService;

/**
 * @author Jake_Stewart & Alex
 *
 */

@SessionScoped
@Named("AccountDetails")
public class AccountDetailsController implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private CurrentUser user;
	@Inject
	private AddressManager addressManager;
	@Inject
	private AccountDetailsService accountService;
	@Inject
	private CardDetailsManager cardManager;
	
	private List<Address> addresses = null;
	private List<CardDetails> cards = null;

	
	private PaginationHelper pagination = null;
	
	private long id;
	private String addressLine1 = "";
	private String addressLine2 = "";
	private String county = "";
	private String city = "";
	private String postcode = "";

	
	private String sortCode;
	private String accountNumber;
	private String nameOnCard;
	private String cardNumber;
	private boolean onAddress;



	public List<CardDetails> getCards() {
		cards = accountService.getCardList(user.getCustomer().getIdCustomer());
		return cards;
	}


	public void setCards(List<CardDetails> cards) {
		this.cards = cards;
	}


	public String getSortCode() {
		return sortCode;
	}


	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getNameOnCard() {
		return nameOnCard;
	}


	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}


	public String getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}


	@SuppressWarnings("unchecked")
	public DataModel<CardDetails> getCardModel() {
		return (DataModel<CardDetails>) getCardPage().createCardModel();

	}
	
	
	public PaginationHelper getCardPage() {
		if (pagination == null) {
			onAddress = false;
			pagination = new PaginationHelper(9) {
				
				@Override
				public int getItemsCount() {
					onAddress = false;
					return accountService.getCardList(user.getCustomer().getIdCustomer()).size();
				}
				
				@Override
				public ListDataModel<CardDetails> createPageDataModel() {
					onAddress = false;
					try {
						return new ListDataModel<CardDetails>(accountService.getCardList(user.getCustomer().getIdCustomer()).subList(getPageFirstItem(),
								getPageFirstItem() + getPageSize()));
					} catch (Exception e) {
						return new ListDataModel<CardDetails>(accountService.getCardList(user.getCustomer().getIdCustomer()).subList(getPageFirstItem(), getItemsCount()));
					}
				}

				@Override
				public DataModel<?> createCardModel() {
					onAddress = false;
					try {
						return new ListDataModel<CardDetails>(accountService.getCardList(user.getCustomer().getIdCustomer()).subList(getPageFirstItem(),
								getPageFirstItem() + getPageSize()));
					} catch (Exception e) {
						return new ListDataModel<CardDetails>(accountService.getCardList(user.getCustomer().getIdCustomer()).subList(getPageFirstItem(), getItemsCount()));
					}
				}

				@Override
				public DataModel<?> createAddressModel() {
					onAddress = true;
					try {
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
	
	// ADDRESS RELATED

	public long getId() {
		return id;
	}


	public String getAddressLine1() {
		return addressLine1;
	}


	public String getAddressLine2() {
		return addressLine2;
	}


	public CurrentUser getUser() {
		return user;
	}


	public void setUser(CurrentUser user) {
		this.user = user;
	}


	public AddressManager getAddressManager() {
		return addressManager;
	}


	public void setAddressManager(AddressManager addressManager) {
		this.addressManager = addressManager;
	}


	public AccountDetailsService getAccountService() {
		return accountService;
	}


	public void setAccountService(AccountDetailsService accountService) {
		this.accountService = accountService;
	}


	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}


	public void setPagination(PaginationHelper pagination) {
		this.pagination = pagination;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}


	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}


	public void setCounty(String county) {
		this.county = county;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public void setPostcode(String postcode) {
		this.postcode = postcode;
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

	
	
	
	private void recreateModel() {
		addresses = null;
	}
	
	
	public List<Address> getAllAddresses(){
		addresses = addressManager.findAllAddressesByID(user.getCustomer().getIdCustomer());
		return addresses;
	}
	
	public PaginationHelper getAddressPage() {
		if (pagination == null) {
			onAddress = true;
			pagination = new PaginationHelper(9) {
				
				@Override
				public int getItemsCount() {
					onAddress = true;
					return accountService.getAddressList(user.getCustomer().getIdCustomer()).size();
				}
				
				@Override
				public ListDataModel<Address> createPageDataModel() {
					onAddress = true;
					try {
						return new ListDataModel<Address>(accountService.getAddressList(user.getCustomer().getIdCustomer()).subList(getPageFirstItem(),
								getPageFirstItem() + getPageSize()));
					} catch (Exception e) {
						return new ListDataModel<Address>(
								accountService.getAddressList(user.getCustomer().getIdCustomer()).subList(getPageFirstItem(), getItemsCount()));
					}
				}

				@Override
				public DataModel<?> createCardModel() {
					onAddress = false;
					try {
						return new ListDataModel<CardDetails>(accountService.getCardList(user.getCustomer().getIdCustomer()).subList(getPageFirstItem(),
								getPageFirstItem() + getPageSize()));
					} catch (Exception e) {
						return new ListDataModel<CardDetails>(accountService.getCardList(user.getCustomer().getIdCustomer()).subList(getPageFirstItem(), getItemsCount()));
					}
				}

				@Override
				public DataModel<?> createAddressModel() {
					onAddress = true;
					try {
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
		if (onAddress){
			getAddressPage().nextPage();
			recreateModel();
			return "addressdetails";
		}
		else{
			getCardPage().nextPage();
			recreateModel();
			return "carddetails";
		}
	}

	public String previous() {
		if (onAddress){
			getAddressPage().nextPage();
			recreateModel();
			return "addressdetails";
		}
		else{
			getCardPage().nextPage();
			recreateModel();
			return "carddetails";
		}
	}
	
	public List<Address> getAddresses() {
		addresses = accountService.getAddressList(user.getCustomer().getIdCustomer());
		return addresses;
	}
	
	
	@SuppressWarnings("unchecked")

	public DataModel<Address> getAddressModel() {
		return (DataModel<Address>) getAddressPage().createAddressModel();
	}
	
	public String addAddress(){
			accountService.addAddress(user.getCustomer().getIdCustomer(), addressLine1, addressLine2, county, city, postcode);
		return "addressdetails";
	}
	

	public String addCard(){
			accountService.addCard(user.getCustomer().getIdCustomer(), nameOnCard, cardNumber, sortCode);
		return "carddetails";
	}
	



}
