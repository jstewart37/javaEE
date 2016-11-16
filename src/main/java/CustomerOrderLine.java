import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="customerOrderLine")
public class CustomerOrderLine {

	@Column(name = "Customer Order", nullable = false, length=255)
	@Size(max=255)
	@NotNull
	private int customerOrder;
	
	@Column(name = "Product ID", nullable = false, length=255)
	@Size(max=255)
	@NotNull
	private int productID;
	
	@Column(name = "Quantity", nullable = false, length=255)
	@Size(max=255)
	@NotNull
	private int quantity;
	
	@Column(name = "Order Line Prices", nullable = false, length=255)
	@Size(max=255)
	@NotNull
	private String orderLinePrice;

	public void customerOrderLine() {
	}

	public CustomerOrderLine(int customerOrder, int productID, int quantity, String orderLinePrice) {
	}
}