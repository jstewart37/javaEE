package Entitys;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@IdClass(Address.class)
@Entity
@Table(name = "Card Details")
public class CardDetails {

	@OneToMany
	@JoinColumn(name = "Customer ID", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String customerID;

	@Column(name = "Sort Code", nullable = false, length = 10)
	@Size(max = 10)
	@NotNull
	private String sortCode;

	@Column(name = "Account Number", nullable = false, length = 12)
	@Size(max = 12)
	@NotNull
	private String accountNumber;

	@Column(name = "nameOnCard", nullable = false, length = 255)
	@Size(max = 255)
	@NotNull
	private String nameOnCard;

	@Id
	@Column(name = "Card Number", nullable = false, length = 16)
	@Size(max = 16)
	@NotNull
	private String cardNumber;

	@Id
	@OneToOne
	@JoinColumn(name = "Billing Address", nullable = false)
	@Size(max = 255)
	@NotNull
	private Address billingAddress;

	public void cardDetails() {
	}

	public CardDetails(String sortCode, String accountNumber, String nameOnCard, String cardNumber, int billingAddress,
			int customerID) {

	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getSortCode() {
		return sortCode;
	}

	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

}
