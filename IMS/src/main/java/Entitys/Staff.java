package Entitys;

// Vera was here
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "Staff")
public class Staff {

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
	public Staff(String username, String password, String fname, String sname, String email) {
		this.username = username;
		this.fname = fname;
		this.sname = sname;
		this.email = email;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	// getters and setters

	

}