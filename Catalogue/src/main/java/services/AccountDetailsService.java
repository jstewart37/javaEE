package services;


import java.util.ArrayList;

/**
 * @author Jake_Stewart
 */

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.context.*;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.inject.Named;

import EntityManagers.*;
import Entitys.*;


@Stateless

public class AccountDetailsService {
	@Inject
	private AddressManager addressManager;

	public  List<Address> findAll(long id) {
		System.out.println("in accountService. going to address manager to find all addresses with this ID" + id);
		return addressManager.findAllAddressesByID(id);
	}	
	
}
