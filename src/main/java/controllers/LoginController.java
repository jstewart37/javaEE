package controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

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
			if (loginService.validLogin(email, password)) {
				currentUser.setCustomer(loginService.getEmail(email));
				return "catalogue";
			}
		}
		password = "";
		return "index";
		
	}
	
	public String logout()  {
		System.out.println("Logging out");
	    currentUser.setCustomer(null);
//	ExternalContext ectx = FacesContext.getCurrentInstance().getExternalContext();
//    HttpServletResponse response = (HttpServletResponse)ectx.getResponse();
//    HttpSession session = (HttpSession)ectx.getSession(false);
//    session.invalidate();
//    
//    response.sendRedirect("index.xhtml");
    return "index";
	}
}
