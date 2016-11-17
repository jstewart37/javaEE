package Entitys;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@NamedQueries({
@NamedQuery(name="findByName", query="SELECT s FROM suppliers s WHERE s.supplier_name LIKE :supplierName"),
@NamedQuery(name="findByEmail", query="SELECT s FROM suppliers a WHERE s.email LIKE :email"),
})





@Entity
@Table (name = "suppliers")
public class Supplier {

	// variables
	@Id @Column (name = "id_Supplier", nullable = false, unique = true) @GeneratedValue(strategy = GenerationType.IDENTITY) private long idSupplier;
	
	@Column(name ="supplier_name", nullable = false, length = 100) @Size(max = 100) @NotNull private String supplierName;
	
	@Column(name ="supplier_phone", nullable = false, length = 20) @Size(max = 20) @NotNull @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$",
            message="{invalid.phonenumber}")private String supplierPhone;
	
	@Column(name ="email", nullable = false, length = 100) @Size(max = 100) @NotNull  @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
	        +"[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
	        +"(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",
	             message="{invalid.email}") private String email;

	
	// constructors
	public Supplier(long idSupplier,
						String supplierName,
						String supplierPhone,
						String email){}
	
	
	// getters & setters
	public long getIdSupplier() {
		return idSupplier;
	}


	public void setIdSupplier(long idSupplier) {
		this.idSupplier = idSupplier;
	}


	public String getSupplierName() {
		return supplierName;
	}


	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}


	public String getSupplierPhone() {
		return supplierPhone;
	}


	public void setSupplierPhone(String supplierPhone) {
		this.supplierPhone = supplierPhone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
