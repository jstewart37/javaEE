package EntityManagers;
import Entitys.Address;


public interface AddressManager {
	public Address findByEmail(String email);
}
