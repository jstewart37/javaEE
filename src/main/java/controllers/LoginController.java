package controllers;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

import Entitys.Customer;
import services.LoginService;

//@author Sophie

@RequestScoped
@Named(value = "login")
public class LoginController {
	
	@Inject 
	private CurrentUser currentUser;
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
		if (!email.isEmpty() && !password.isEmpty()) {
			System.out.println("email" + email);
			if (loginService.validLogin(email, password)) {
				System.out.println("valid!");
				currentUser.setCustomer(loginService.getEmail(email));
				return "catalogue";
			}
		}
		password = "";
		return "index";
		
	}

	public String logout() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
	    session.invalidate();
		return "index";
	}
}
