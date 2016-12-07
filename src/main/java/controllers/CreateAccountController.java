package controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import services.CreateAccountService;

//@Author Sophie
@RequestScoped
@Named(value = "register")
public class CreateAccountController {
	@Inject
	private RegisterUser registerUser;
	@Inject
	private CreateAccountService createAccountService;

	private String firstname = "";
	private String surname = "";
	private String email = "";
	private String password = "";
	private String date = "";

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

	public String registerCustomer() {
		if (!email.isEmpty())
			if (createAccountService.checkEmail(email))
				registerUser.setCustomer(createAccountService.emailRegistered(email));
			else
				email = "Email is already registered";
		return "login";
	}

	public String customerRegistered() {
		registerUser.setCustomer(null);
		return "index";
	}
}
