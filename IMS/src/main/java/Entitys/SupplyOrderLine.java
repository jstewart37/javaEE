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
	@JoinColumn(name = "SupplyOrder", nullable = false)
	@NotNull
	private SupplyOrder supplyOrder;

	@ManyToOne
	@JoinColumn(name = "Product", nullable = false)
	@NotNull
	private Product product;

	// constructor
	public SupplyOrderLine(int quantity, Double supplyOrderLinePrice) {

	}

	public SupplyOrderLine(int quantity, SupplyOrder SupplyOrder, Product product) {
		this.quantity = quantity;
		this.supplyOrder = SupplyOrder;
		this.product = product;
	}
	
	public SupplyOrderLine(int quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}

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

	public SupplyOrder getSupplyOrder() {
		return supplyOrder;
	}

	public void setSupplyOrder(SupplyOrder supplyOrder) {
		this.supplyOrder = supplyOrder;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}


	// getters and setters
	
}
