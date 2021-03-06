package Entitys;

import java.util.List;

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

	@ManyToMany
	@JoinTable(name="BasketList", joinColumns=@JoinColumn(name="customers_id", referencedColumnName="id"), inverseJoinColumns=@JoinColumn(name="product_id", referencedColumnName="id"))
	private List<Product> basketList = null;
	
	@ManyToMany
	@JoinTable(name="AddressList", joinColumns=@JoinColumn(name="customers_id", referencedColumnName="id"), inverseJoinColumns=@JoinColumn(name="address_id", referencedColumnName="id"))
	private List<Address> addressList = null;
	
	@ManyToMany
	@JoinTable(name="CardList", joinColumns=@JoinColumn(name="customers_id", referencedColumnName="id"), inverseJoinColumns=@JoinColumn(name="name", referencedColumnName="id"))
	private List<CardDetails> cardList = null;

	@Author(author = "Ben")
	// constructors
	public Customer(long idCustomer, String title, String name, String email, String password, String phone,
			String date, List<Address> address, List<CardDetails> cardList) {
		this.idCustomer = idCustomer;
		this.title = title;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.date = date;
		this.addressList = address;
		this.cardList = cardList;
	}

	public Customer(String title, String name, String email, String password, String phone,
			String date) {
		this.title = title;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.date = date;
	}
	// getters and setters

	public List<Product> getBasketlist() { return basketList;}
	public void setBasketlist(List<Product> basketList) { this.basketList = basketList; }
	
	public List<Address> getAddressList() { System.out.println("got this customers address list" +this.idCustomer);return addressList;}
	public void setAddressList(List<Address> addressList) { System.out.println("found the customer, their address list is now updated"); this.addressList = addressList; }
	
	public List<CardDetails> getCardList() { System.out.println("got this customers address list" +this.idCustomer);return cardList;}
	public void setCardList(List<CardDetails> cardList) { System.out.println("found the customer, their address list is now updated"); this.cardList = cardList; }
	
	public Customer() {
			// TODO Auto-generated constructor stub
	}

	public long getIdCustomer() {
	//	System.out.println("I am customer number - " + idCustomer);
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
