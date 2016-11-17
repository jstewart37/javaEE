package Entitys;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "customers")
public class Customer {

	// variables

	@Id
	@Column(name = "idCustomer", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCustomer;
	
	@Column(nullable = false, length = 15)
	@Size(min = 2, max = 225)
	@NotNull
	private String title;
	
	@Column(nullable = false, length = 100)
	@Size(min = 3, max = 25)
	@NotNull
	private String name;
	
	@Column(nullable = false, length = 150)
	@Size(max = 225)
	@NotNull
	@Pattern(regexp = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\." + "[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
			+ "(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message = "{invalid.email}")
	private String email;
	
	@Column(nullable = false, length = 20)
	@Size(max = 225)
	@NotNull
	@Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$",
    message="{invalid.phonenumber}")
	private String phone;	
	
	@Column(name = "username", nullable = false)
	@Size(min = 8)
	@NotNull
	private String username;
	
	@Column(name = "password", nullable = false)
	@Size(min = 8)
	@NotNull
	private String password;
	
	// constructors
	public Customer(long idCustomer, String title, String name, String email, String phone) {

	}

	// getters and setters

	public long getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(long idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
