import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "Supply Order Line")
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

	
	//constructor
	public SupplyOrderLine(int quantity, Double supplyOrderLinePrice) {

	}

	
	//getters and setters
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
	
	public int getIdProduct() {
		return Product.idProduct;
	}
	
	public int getSupplyOrderId(){
		return SupplyOrder.idSupplyOrder;
	}
	
	

	
	
}
