package OfflineMode;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import EntityManagers.AddressManager;
import Entitys.Address;
import Entitys.Supplier;
import Entitys.TestData;

@Stateless
@Default
public class AddressManagerOffline implements AddressManager {

	@Inject
	private TestData testData;
	
	
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
	public Address createNewAddress(Address address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address readAddress(Address address) {
		// TODO Auto-generated method stub
		return null;
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
