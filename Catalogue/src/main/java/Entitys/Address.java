/**
 * @Author(author="Alex")
 */



package Entitys;
import javax.persistence.*;
import javax.validation.constraints.*;

@NamedQueries({
@NamedQuery(name="findAddressByPostcode", query="SELECT a FROM addresses a WHERE a.postcode LIKE :postcode"),
@NamedQuery(name="findAddressByCounty", query="SELECT a FROM addresses a WHERE a.county LIKE :county"),
@NamedQuery(name="findAddressByPostcodeAndNumber", query="SELECT a FROM addresses a WHERE a.postcode=:postcode AND a.address_line_1 LIKE :addressLine1")
})

@Entity
@Table(name = "addresses")
@Embeddable
public class Address {
	
	// variables
	@Id @Column(name ="id_Address", nullable = false, unique = true) @GeneratedValue(strategy = GenerationType.IDENTITY)private long idAddress;
	@Column(name ="address_line_1", nullable = false, length = 100)@Size(max=100) @NotNull private String addressLine1;
	@Column(name ="address_line_2", length = 100) @Size(max=100) private String addressLine2;
	@Column(name ="postcode", nullable = false, length = 10) @Size(max=10) @NotNull private String postCode;
	@Column(name ="county", nullable = false, length = 100) @Size(max=100) @NotNull private String county;
	@Column(name ="city", nullable = false, length = 100) @Size(max=100) @NotNull private String city;
	
	

	
	@OneToMany
	@JoinColumn(name = "customer_id", nullable = false) @NotNull private Customer customer;
	
	@OneToMany
	@JoinColumn(name = "supplier_id", nullable = false) @NotNull private Supplier supplier;
	

	// private customer_id FOREIGN KEYS
	// private supplier_id FOREIGN KEYS


	public Address(){};

	public Address(long idAddress, String addressLine1, String postCode, String county,
			String city) {
		this.idAddress = idAddress;
		this.addressLine1 = addressLine1;
		this.postCode = postCode;
		this.county = county;
		this.city = city;
	}

	public Address(long idAddress, String addressLine1, String addressLine2, String postCode, String county,
			String city) {
		System.out.println("Made a new address");
		this.idAddress = idAddress;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.postCode = postCode;
		this.county = county;
		this.city = city;
	}

	// getters & setters
	public Address getAddress(){
		return this;
	}
	public long getIdAddress() {
		return idAddress;
	}

	public void setIdAddress(long idAddress) {
		this.idAddress = idAddress;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getId() {
		return this.idAddress;
	}
	
	
	@Author(author = "alex")
	public void addAddressInfo(long custID, String addressLine1, String addressLine2, String postCode, String county,
			String city) {
		this.idAddress = custID;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.postCode = postCode;
		this.county = county;
		this.city = city;
	}

	
}
