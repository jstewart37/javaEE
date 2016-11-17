package Entitys;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@IdClass(Product.class)
@Entity
@Table(name = "customerOrderLine")
public class CustomerOrderLine {

	@Id
	@ManyToOne
	@Column(name = "Customer Order", nullable = false, length = 255)
	@Size(max = 255)
	@NotNull
	private int customerOrder;

	@Id
	@ManyToOne
	@Column(name = "Product ID", nullable = false, length = 255)
	@Size(max = 255)
	@NotNull
	private int productID;

	@Column(name = "Quantity", nullable = false, length = 255)
	@Size(max = 255)
	@NotNull
	private int quantity;

	@Column(name = "Order Line Prices", nullable = false, length = 255)
	@Size(max = 255)
	@NotNull
	private double orderLinePrice;

	public void customerOrderLine() {
	}

	public CustomerOrderLine(int customerOrder, int productID, int quantity, double orderLinePrice) {
	}

	public int getCustomerOrder() {
		return customerOrder;
	}

	public void setCustomerOrder(int customerOrder) {
		this.customerOrder = customerOrder;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getOrderLinePrice() {
		return orderLinePrice;
	}

	public void setOrderLinePrice(double orderLinePrice) {
		this.orderLinePrice = orderLinePrice;
	}

}