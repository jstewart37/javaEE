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
	private SupplyOrder SupplyOrder;

	@ManyToOne
	@JoinColumn(name = "Product", nullable = false)
	@NotNull
	private Product product;

	// constructor
	public SupplyOrderLine(int quantity, Double supplyOrderLinePrice) {

	}

	public SupplyOrderLine(int quantity, SupplyOrder idSupplyOrder, Product product) {
		this.quantity = quantity;
		this.SupplyOrder = idSupplyOrder;
		this.product = product;
	}
	
	public SupplyOrderLine(int quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
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

	

	public SupplyOrder getSupplyOrder() {
		return SupplyOrder;
	}

	public void setSupplyOrder(SupplyOrder supplyOrder) {
		SupplyOrder = supplyOrder;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setSupplyOrderLinePrice(Double supplyOrderLinePrice) {
		this.supplyOrderLinePrice = supplyOrderLinePrice;
	}

	public long getIdProduct() {
		return product.getIdProduct();

	}
}
