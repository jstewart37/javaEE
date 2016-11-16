import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "addresses")
public class Address {
	
	// variables
	@Id @Column(name ="id_Address", nullable = false, unique = true) @GeneratedValue(strategy = GenerationType.IDENTITY)private long idAddress;
	@Column(name ="address_Line_1", nullable = false, length = 100)@Size(max=100) @NotNull private String addressLine1;
	@Column(name ="address_Line_2", length = 100) @Size(max=100) private String addressLine2;
	@Column(name ="postcode", nullable = false, length = 10) @Size(max=10) @NotNull private String postCode;
	@Column(name ="county", nullable = false, length = 100) @Size(max=100) @NotNull private String county;
	@Column(name ="city", nullable = false, length = 100) @Size(max=100) @NotNull private String city;
	
	
	// private customer_id FOREIGN KEYS
	// private supplier_id FOREIGN KEYS

	
	// constructors
	public Address(long idAddress,
			String addressLine1,
			String addressLine2,
			String postCode,
			String County,
			String city)
	{}
	
	public Address(long idAddress,
			String addressLine1,
			String postCode,
			String County,
			String city)
	{}

	// getters & setters
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
					
	

	
}
