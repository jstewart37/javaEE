package controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import services.CreateAccountService;


@RequestScoped
@Named(value = "registered")
public class CreateAccountController {
	@Inject private CurrentUser currentUser;
	@Inject
	private CreateAccountService createAccountService;
	private String email = "";
	

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String register() {
		if (!email.isEmpty())
			if (createAccountService.checkEmail(email))
				currentUser.setCustomer(createAccountService.emailRegistered(email));
			else
				email = "Email is already registered";
		return "login";
	}

	public String logout() {
		currentUser.setCustomer(null);
		return "index";
	}
}
