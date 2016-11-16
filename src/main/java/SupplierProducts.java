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
	private Suppler idSupplier;

	@ManyToOne
	@JoinColumn(name = "Product", nullable = false)
	@NotNull
	private Product idProduct;

	// getters and setters

	public int getProductId() {
		return Product.idProduct;
	}

	public int getSupplierId() {
		return Supplier.idSupplier;
	}

}
