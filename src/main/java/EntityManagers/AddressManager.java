/**
 * @Author(author="Alex")
 */

package EntityManagers;
import Entitys.Address;
import Entitys.Author;


public interface AddressManager {
	@Author(author="Alex")
	// query based stubs
	public Address findAddressByPostcode(String postcode);
	public Address findAddressByCounty(String county);
	public Address findAddressByPostcodeAndNumber(String postcode, String number);
	
	//CRUD based stubs
	public Address createNewAddress(Address address);
	public Address readAddress(Address address);
	public Address updateAddress(Address address);
	
}
