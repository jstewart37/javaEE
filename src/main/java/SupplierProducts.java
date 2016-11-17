import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Supplier Products")
@NamedQueries({
	@NamedQuery(name="ProductName", query="Select P.name, S.supplierName from Product P join SupplierProducts SP on P.idProduct = SP.idProduct join Supplier S on SP.supplierId = S.idSupplier")
})
	public class SupplierProducts {
	
	
	// constructors
	public SupplierProducts() {

	}

	// foreign keys

	@ManyToOne
	@JoinColumn(name = "Supplier", nullable = false)
	@NotNull
	private Supplier idSupplier;

	@ManyToOne
	@JoinColumn(name = "Product", nullable = false)
	@NotNull
	private Product idProduct;

	// getters and setters

	public long getProductId() {
		return idProduct.getIdProduct();
	}

	public long getSupplierId() {
		return idSupplier.getIdSupplier();
	}

}
