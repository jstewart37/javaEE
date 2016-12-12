/**
 * @Author(author="Alex")
 */


package Entitys;
import javax.persistence.*;
import javax.validation.constraints.*;


@NamedQueries({
@NamedQuery(name="findSupplierName", query="SELECT s FROM suppliers s WHERE s.supplier_name LIKE :supplierName"),
@NamedQuery(name="findSupplierByEmail", query="SELECT s FROM suppliers s WHERE s.email LIKE :email"),
@NamedQuery(name="findSupplierProducts", query="SELECT s.id_supplier,s.supplier_name, p.productID, p.productName FROM suppliers s JOIN Supplier Products sp ON s.id_supplier=sp.id_supplier JOIN PRODUCTS p ON sp.productID = p.idproduct"),
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
