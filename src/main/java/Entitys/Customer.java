package Entitys;

import javax.persistence.*;
import javax.validation.constraints.*;

@NamedQueries({ @NamedQuery(name = "findByEmail", query = "SELECT c FROM customer c WHERE c.email=:email"),
		@NamedQuery(name = "searchByItem", query = "SELECT * FROM product p WHERE p.product LIKE :search"), })

@Entity
@Table(name = "customer")
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
	@Pattern(regexp = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message = "{invalid.phonenumber}")
	private String phone;

	@Column(nullable = false, length = 20)
	@Size(max = 225)
	@NotNull
	@Pattern(regexp = "^\\(?(\\d{3})\\)?[- ]?(\\d{44})[- ]?(\\d{4})$", message = "{invalid.dob}")
	private String date;

	@Column(name = "username", nullable = false)
	@Size(min = 8)
	@NotNull
	private String username;

	@Column(name = "password", nullable = false)
	@Size(min = 8)
	@NotNull
	private String password;

	@Column(nullable = false, length = 100)
	@Size(min = 3, max = 50)
	@NotNull
	private String search;

	@Column(nullable = false, length = 100)
	@Size(min = 3, max = 25)
	@NotNull
	private String AddressLine1;

	@Column(nullable = false, length = 100)
	@Size(min = 3, max = 25)
	@NotNull
	private String AddressLine2;

	@Column(nullable = false, length = 100)
	@Size(min = 3, max = 25)
	@NotNull
	private String county;

	@Column(nullable = false, length = 100)
	@Size(min = 3, max = 25)
	@NotNull
	private String City;

	@Column(nullable = false, length = 100)
	@Size(min = 3, max = 25)
	@NotNull
	private String PostCode;

	@Author(author = "Ben")
	// constructors
	public Customer(long idCustomer, String title, String name, String email, String password, String phone,
			String date) {
		this.title = title;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.date = date;
	}

	// getters and setters

	public Customer() {
		// TODO Auto-generated constructor stub
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
