package controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import EntityManagers.CustomerManager;
import Entitys.Customer;
import services.CreateAccountService;

//@Author Sophie
@RequestScoped
@Named(value = "register")
public class CreateAccountController {
	@Inject
	private CustomerManager customerManager;
	@Inject
	private CreateAccountService createAccountService;

	private String title = "";
	private String firstname = "";
	private String surname = "";
	private String email = "";
	private String password = "";
	private String date = "";
	private String phone = "";

	public String getDate() {
		return date;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getSurname() {
		return surname;
	}

	public String getPassword() {
		return password;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String registerCustomer() {
		if (!email.isEmpty()&&!password.isEmpty())
			customerManager.createNewCustomer(new Customer(title, firstname.concat(surname), email, password, phone, date));
			
		System.out.println(customerManager.findByEmail(email).getName());
		
		return "index";
	}

	public String checkEmail() {
		if (!email.isEmpty()&&!password.isEmpty())
			createAccountService.checkEmail(email);
	
		System.out.println(createAccountService.checkEmail(email));
	
		return "index";
	}
}
