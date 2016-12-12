package Entitys;

// Vera was here
import javax.persistence.*;
import javax.validation.constraints.*;


public class LoginIMS {

	
	@Entity
	@Table(name = "login")
	public class loginIMS {

		// variables
		
	@Id
	@Column(name = "username", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String username;
	
	
	@Column(name = "password", nullable = false, length = 100)
	@Size(max = 100)
	@NotNull
	private String password;
	
	@Column(name = "fname", nullable = false, length = 100)
	@Size(max = 100)
	@NotNull
	private String fname;
	
	@Column(name = "sname", nullable = false, length = 100)
	@Size(max = 100)
	@NotNull
	private String sname;
	
	@Column(nullable = false, length = 150)
	@Size(max = 225)
	@NotNull
	@Pattern(regexp = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\." + "[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
			+ "(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message = "{invalid.email}")
	private String email;
	
	@Author(author = "Vera")
	// constructors
	public loginIMS (String username, String password, String fname, String sname, String email) {
		this.username = username;
		this.fname = fname;
		this.sname = sname;
		this.email = email;
		this.password = password;
		
	}

	public static void add(LoginIMS loginIMS) {
		// TODO Auto-generated method stub
		
	}
	}
	}
	
	// getters and setters

	

