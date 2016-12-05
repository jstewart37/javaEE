package controllers;

@RequestScoped
@Named(value = "createAccount")

public class CreateAccountController {
	
	
		
		@Inject
		private CreateAccountService createAccountService;
		private String firstname ="";
		private String surname = "";
		private String email = "";
		private String password = "";
		private String confirmPassword = "";
		private String dOB = "";

		public String firstname() {
			return firstname;
		}
		
		public String surname() {
			return surname;
		}
		public String getEmail() {
			return email;
		}

		public String getPassword() {
			return password;
		}
		
		public String confirmPassword() {
			return confirmPassword;
		}
		
		public String dOB() {
			return dOB;
		}
		
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		
		public void setSurname(String surname) {
			this.surname = surname;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
		public void SetConfirmPassword(String confirmPassword) {
			this.confirmPassword = confirmPassword;
		}
		
		public void setDOB(String dOB) {
			this.dOB = dOB;
		}

		public String login() {
			if (!email.isEmpty() && !password.isEmpty())
				if (createAccountService.validCreateAccount(firstname, surname, email, password ))
					currentUser.setCustomer(loginService.loginUser(email));
				else
					password = "";
			return "nbgardens";
		}

		public String logout() {
			currentUser.setCustomer(null);
			return "nbgardens";
		}
	}

}
