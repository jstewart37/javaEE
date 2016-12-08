
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
	@Author(author="Alex")

	
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
		for (Address address : testData.getAddresses()){
			if (address.getIdAddress() == ID){
				return address;
			}
		}
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

	@Override
	public Address updateAddress(Address address) {
		List<Address> addresses = testData.getAddresses();
		for(Address a : addresses){
			if(a.getCity() == "Manchester"){
				a.setCity("Swansea");
			}
		}
		return address;
	}

}
