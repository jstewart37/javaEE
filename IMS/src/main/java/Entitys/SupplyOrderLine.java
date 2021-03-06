package Entitys;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "Supply Order Line")
@NamedQueries({
	@NamedQuery(name="ProductNamePrice", query="SELECT so.*, p.name from Product p join SupplyOrderLine so on p.idProduct = so.productId")
})
public class SupplyOrderLine {

	// variables

	@Column(nullable = false, length = 8)
	@Size(min = 1, max = 8)
	@NotNull
	private int quantity;
	@Column(nullable = false, length = 10)
	@Size(min = 5, max = 10)
	@NotNull
	private Double supplyOrderLinePrice;

	// foreign keys
	@ManyToOne
	@JoinColumn(name = "Supply Order", nullable = false)
	@NotNull
	private SupplyOrder idSupplyOrder;

	@ManyToOne
	@JoinColumn(name = "Product", nullable = false)
	@NotNull
	private Product idProduct;

	// constructor
	public SupplyOrderLine(int quantity, Double supplyOrderLinePrice) {

	}

	// getters and setters
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getSupplyOrderLinePrice() {
		return supplyOrderLinePrice;
	}

	public void setSupplyOrderLinePrice(Double supplyOrderLinePrice) {
		this.supplyOrderLinePrice = supplyOrderLinePrice;
	}

	public long getIdProduct() {
		return idProduct.getIdProduct();

	}

	public long getSupplyOrderId() {
		return idSupplyOrder.getIdSupplyOrder();
	}

}
