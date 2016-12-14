package EntityManagers;
// Vera was here
import Entitys.Staff;

public interface StaffManager {

	// named query stubs
	public Staff findByEmail(String email);
	public Staff findByUsername(String username);

	// CRUD stubs
	public Staff createNewLoginIMS(Staff loginIMS);
	public Staff readLoginIMS(Staff loginIMS);
	public Staff updatePassword(Staff loginIMS);

}