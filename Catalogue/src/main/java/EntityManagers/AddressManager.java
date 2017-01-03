/**
 * @Author(author="Alex")
 */

package EntityManagers;
import java.util.List;

import Entitys.Address;
import Entitys.Author;
import Entitys.Product;


public interface AddressManager {
	@Author(author="Alex")
	// query based stubs
	public Address findAddressByPostcode(String postcode);
	public Address findAddressByCounty(String county);
	public Address findAddressByPostcodeAndNumber(String postcode, String number);
	public Address findAddressByID(long id);
	public List<Address> findAllAddressesByID(long id);
	
	
	
	//CRUD based stubs
	public Address createNewAddress(Address address);
	public Address readAddress(Address address);
	public Address updateAddress(Address address);
	
}
