
public class CustomerOrder {
	private int idCustomerOrder;
	private String status;
	private int cardDetails;
	private int customerId;
	private String dateStampPlaced;
	private int addressId;
	private int billingAddress;
	private int cardNumber;
	private String dateTimeRecieved; // the date the customer receives order

	public CustomerOrder() {
	}

	public CustomerOrder(int idCustomerOrder, String status, int cardDetails, int customerId, String dateStampPlaced,
			int addressId, int billingAddress, int cardNumber, String dateTimeRecieved) {
	}

	public CustomerOrder(int idCustomerOrder, String status, int cardDetails, int customerId, String dateStampPlaced,
			int addressId, int billingAddress, int cardNumber) {
	}

}
