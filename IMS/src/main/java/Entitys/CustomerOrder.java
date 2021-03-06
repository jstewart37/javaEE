package Entitys;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * @author Jake Stewart
 *  **/

@Entity
@Table(name = "CustomerOrder")
@NamedQueries({
	//this query would be used in order to return the ID's of orders based on a specific customer ID
@NamedQuery(name="CustomerOrdersOverview", query="Select CO.idCustomerOrder from CustomerOrders CO join Customers C on CO.CustomerId = C.idCustomer where CO.customerId=:customerId "),
	//this query would return the order details for a specific order (based on a orderID) 
@NamedQuery(name="CustomerOrderDetails", query="Select CO.idCustomerOrder,P.name "
		+ "from CustomerOrders CO join CustomerOrderLine COL on CO.idCustomerOrder = COL.idCustomerOrder "
		+ "join products p on COL.productID = p.idProduct "
		+ "where CO.customerId=:customerID ") 
})
public class CustomerOrder {

	@Id
	@Column(name = "idCustomerOrder", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCustomerOrder;

	@Column(name = "Customerstatus", nullable = false, length = 45)
	@Size(max = 45)
	@NotNull
	private String status;

	@ManyToOne
	@JoinColumn(name = "customerID", nullable = false)
	@NotNull
	private long customerID;

	@Column(name = "dateStampPlaced", nullable = false)
	@NotNull
	private String dateStampPlaced;

	@ManyToOne
	@JoinColumn(name = "addressId", nullable = false)
	@NotNull
	private Address Address;

	@ManyToOne
	@JoinColumn(name = "billingAddress", nullable = false)
	@NotNull
	private Address billingAddress;

	@ManyToOne
	@JoinColumn(name = "cardNumber", nullable = false)
	@Size(max = 45)
	@NotNull
	private CardDetails CardDetails;

	@Column(name = "dateTimeRecieved")
	private String dateTimeRecieved; // the date the customer receives order
	// method

	// Constructors
	public CustomerOrder(long idCustomerOrder, String status, long customerID, String dateStampPlaced,
			Address addressId, Address billingAddress, int cardNumber, String dateTimeRecieved) {
	}

	public CustomerOrder(long idCustomerOrder, String status, long customerID, String dateStampPlaced,
			Address addressId, Address billingAddress, int cardNumber) {
	}

	public CustomerOrder(long idCustomerOrder, String status, long customerID, String dateStampPlaced, Address address,
			Address billingAddress, CardDetails cardDetails, String dateTimeRecieved) {
		super();
		this.idCustomerOrder = idCustomerOrder;
		this.status = status;
		this.customerID = customerID;
		this.dateStampPlaced = dateStampPlaced;
		Address = address;
		this.billingAddress = billingAddress;
		CardDetails = cardDetails;
		this.dateTimeRecieved = dateTimeRecieved;
	}
	
	// getters and setters

	public long getIdCustomerOrder() {
		return idCustomerOrder;
	}

	public void setIdCustomerOrder(int idCustomerOrder) {
		this.idCustomerOrder = idCustomerOrder;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getDateStampPlaced() {
		return dateStampPlaced;
	}

	public void setDateStampPlaced(String dateStampPlaced) {
		this.dateStampPlaced = dateStampPlaced;
	}

	public Address getAddress() {
		return Address;
	}

	public void setAddress(Address address) {
		Address = address;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public CardDetails getCardDetails() {
		return CardDetails;
	}

	public void setCardDetails(CardDetails cardDetails) {
		CardDetails = cardDetails;
	}

	public String getDateTimeRecieved() {
		return dateTimeRecieved;
	}

	public void setDateTimeRecieved(String dateTimeRecieved) {
		this.dateTimeRecieved = dateTimeRecieved;
	}

}