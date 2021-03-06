package Entitys;
import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@Table(name="supplyOrder")
public class SupplyOrder {

	// variables
	
	@Id	@Column (name="idSupplyOrder", nullable=false, unique=true) @GeneratedValue(strategy=GenerationType.IDENTITY) private long idSupplyOrder;
	@Column(nullable=false, length=20)	@Size(min=5, max=225) @NotNull	private String status;
	@Column(nullable=false, length=50)	@Size(min=8, max=225) @NotNull	private String dateTimePlaced;
	@Column(nullable=false, length=50)	@Size(min=8, max=225) private String dateTimeRecieved;
	
	@Author(author="Ben")
	// constructors
	public SupplyOrder(long idSupplyOrder, String status, String dateTimePlaced, String dateTimeRecieved)
	{};
	
	
	//may need to alter below code at later date, added to work with add new order page. does not link with orderline
	public SupplyOrder(long idSupplyOrder,String status,String Supplier, String dateTimePlaced,String OrderItems,int TotalPrice, String pottentialDeliveryDate)
	{
		
	}
	
	// Foreign Keys
	@ManyToOne
	@JoinColumn(name="idSupplier", nullable=false)
	@NotNull
	private Supplier idSupplier;
	
	// getters and setters
	
	public long getIdSupplyOrder() {
		return idSupplyOrder;
	}

	public void setIdSupplyOrder(long idSupplyOrder) {
		this.idSupplyOrder = idSupplyOrder;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDateTimePlaced() {
		return dateTimePlaced;
	}

	public void setDateTimePlaced(String dateTimePlaced) {
		this.dateTimePlaced = dateTimePlaced;
	}

	public String getDateTimeRecieved() {
		return dateTimeRecieved;
	}

	public void setDateTimeRecieved(String dateTimeRecieved) {
		this.dateTimeRecieved = dateTimeRecieved;
	}
	
	public long getIdSupplier() {
		return idSupplier.getIdSupplier();
	}
	
}
