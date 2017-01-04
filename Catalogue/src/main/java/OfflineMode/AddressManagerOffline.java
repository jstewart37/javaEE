
package OfflineMode;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import EntityManagers.AddressManager;
import Entitys.Address;
import Entitys.Author;
import Entitys.Customer;
import Entitys.Product;
import Entitys.Supplier;
import Entitys.TestData;

/**
 * @Author(author="Alex")
 */

@Stateless
@Default
public class AddressManagerOffline implements AddressManager {

	@Inject
	private TestData testData;

	@Author(author = "Alex")

	@Override
	public Address findAddressByPostcode(String postcode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address findAddressByCounty(String county) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address findAddressByPostcodeAndNumber(String postcode, String number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address findAddressByID(long ID) {
		for (Address address : testData.getAddresses()) {
			if (address.getIdAddress() == ID) {
				return address;
			}
		}
		return null;
	}
	@Override
	public List<Address> findByCustomerId(long id){
		for(Customer customer : testData.getCustomers())
			if(customer.getIdCustomer() == id)
				return customer.getAddressList();
		return null;
	}
		

	@Override
	public Address createNewAddress(Address address) {
		List<Address> addresses = testData.getAddresses();
		addresses.add(address);
		testData.setAddresses(addresses);
		return address;

	}

	@Override
	public Address readAddress(Address address) {
		List<Address> addresses = testData.getAddresses();
		return address;
	}


	@SuppressWarnings("null")
	@Override
	public List<Address> findAllAddressesByID(long id) {
		System.out.println("in address manager. time to get this users addresses");
		List<Address> addresses = testData.getAddresses();
		List<Address> usersAddresses = null;
		for (Address address : addresses){
			if (address.getIdAddress() == id){
				usersAddresses.add(address.getAddress());
			}
		
		}
		return usersAddresses;

}

	@Override
	public void updateAddressList(long id, List<Address> addresses) {
		List<Customer> customers = testData.getCustomers();
		for(Customer customer : customers)
			if(customer.getIdCustomer() == id){
				System.out.println("find the customer so I can update their addresslist");
				customer.setAddressList(addresses);
			}
		System.out.println("updating the testdata with the new list of customers");
		testData.setCustomers(customers);
		
	}
}
	
