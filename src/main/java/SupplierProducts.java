import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Supplier Products")
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
