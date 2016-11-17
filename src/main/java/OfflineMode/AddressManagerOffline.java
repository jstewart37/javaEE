package OfflineMode;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import EntityManagers.AddressManager;
import Entitys.Address;
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
		// TODO Auto-generated method stub
		return null;
	}

}
