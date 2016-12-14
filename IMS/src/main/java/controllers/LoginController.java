package controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import services.LoginService;

//@author Sophie
//Vera was here too, stealing Sophie's Code

@RequestScoped
@Named(value = "login")
public class LoginController {
	
	@Inject 
	private CurrentUser currentUser;
	@Inject
	private LoginService loginService;
	private String username = "";
	private String password = "";
	private String email = "";
	
	public String getEmail() {
		return email;
	}

	public String setEmail() {
		return email;
	}
	
	
	public String getusername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setusername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {
		if (!username.isEmpty() && !password.isEmpty()) {
			if (loginService.validLogin(username, password)) {
				currentUser.setCustomer(loginService.getEmail(email));
				return "catalogue";
			}
		}
		password = "";
		return "index";
		
	}
	public String loginIMS() {
		if (!username.isEmpty() && !password.isEmpty()) {
			if (loginService.validLoginIMS(username, password)) {
				currentUser.setStaff(loginService.getUsername(username));
				return "catalogue";
			}
		}
		password = "";
		return "index";
		
	}


	public String logout() {
		currentUser.setCustomer(null);
		return "index";

	

	}
}
