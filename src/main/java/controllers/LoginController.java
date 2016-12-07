package controllers;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import Entitys.Customer;
import services.LoginService;

//@author Sophie

@RequestScoped
@Named(value = "login")
public class LoginController {
	@Inject private CurrentUser currentUser;
	@Inject
	private LoginService loginService;
	private String email = "";
	private String password = "";

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {
		if (!email.isEmpty() && !password.isEmpty())
			if (loginService.validLogin(email, password))
				currentUser.setCustomer(loginService.loginUser(email));
			else
				password = "";
		return "catalogue";
	}

	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "index";
	}
}