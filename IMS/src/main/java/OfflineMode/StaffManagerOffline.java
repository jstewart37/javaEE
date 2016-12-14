package OfflineMode;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import EntityManagers.StaffManager;
import Entitys.Product;
import Entitys.Staff;
import Entitys.TestData;


// Vera was here

@Stateless
@Default
public class StaffManagerOffline implements StaffManager {
	@Inject
	private TestData data;
	
	
	
	

	@Override
	public Staff findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Staff findByUsername(String username) {
		List<Staff> staffList = data.getStaffList();
			for (Staff staff : staffList)
				if(staff.getUsername().equalsIgnoreCase(username))
					return staff;
			return null;
		}


	@Override
	public Staff createNewLoginIMS(Staff loginIMS) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Staff readLoginIMS(Staff loginIMS) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Staff updatePassword(Staff loginIMS) {
		// TODO Auto-generated method stub
		return null;
	}

}
