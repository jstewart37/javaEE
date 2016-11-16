import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="CustomerOrder")
public class CustomerOrder {
	
	
	
	@Id
	@Column(name="idCustomerOrder", nullable=false, unique=true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCustomerOrder;
		
	
	@Column(name="Customerstatus", nullable=false, length=45)
	@Size(max=225)
	@NotNull
	private String status;
	
	
	
	
	@Column(name="cardDetails", nullable=false)
	@NotNull
	private CardDetails cardDetails;
	
	@Column(name="customerID", nullable=false)
	@NotNull
	private int customerID;
	
	
	@Column(name="dateStampPlaced", nullable=false)
	@NotNull
	private String dateStampPlaced;
	
	@Column(name="addressId", nullable=false)
	private Address Address;
	
	
	
	
	private int billingAddress;
	private int cardNumber;
	private String dateTimeRecieved; // the date the customer receives order

//method	
	
	public CustomerOrder() {
	}

//Constructors
	public CustomerOrder(int idCustomerOrder, String status, int cardDetails, int customerID, String dateStampPlaced,
			int addressId, int billingAddress, int cardNumber, String dateTimeRecieved) {
	}

	public CustomerOrder(int idCustomerOrder, String status, int cardDetails, int customerID, String dateStampPlaced,
			int addressId, int billingAddress, int cardNumber) {
	}

//DB to entities
	
	
	
	
	
}
