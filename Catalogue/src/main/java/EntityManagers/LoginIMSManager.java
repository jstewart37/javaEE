package EntityManagers;
// Vera was here
import Entitys.LoginIMS;

public interface LoginIMSManager {

	// named query stubs
	public LoginIMS findByEmail(String email);
	public LoginIMS searchByUsername(String username);

	// CRUD stubs
	public LoginIMS createNewLoginIMS(LoginIMS loginIMS);
	public LoginIMS readLoginIMS(LoginIMS loginIMS);
	public LoginIMS updatePassword(LoginIMS loginIMS);
	public LoginIMS 
}