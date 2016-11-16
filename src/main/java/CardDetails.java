import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Card Details")
public class CardDetails {


	@Column(name = "Customer ID", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String customerID;
	
	@Column(name = "Sort Code", nullable = false, length=10)
	@Size(max=10)
	@NotNull
	private String sortCode;

	@Column(name = "Account Number", nullable = false, length=12)
	@Size(max=12)
	@NotNull
	private String accountNumber;

	@Column(name = "nameOnCard", nullable = false, length=255)
	@Size(max=255)
	@NotNull
	private String nameOnCard;
	
	@Id
	@Column(name = "Card Number", nullable = false, length=16)
	@Size(max=16)
	@NotNull
	private String cardNumber;

	@Column(name = "Billing Address", nullable = false, length=255)
	@Size(max=255)
	@NotNull
	private Address billingAddress;



	public void cardDetails() {
	}

	public CardDetails(String sortCode, String accountNumber, String nameOnCard, String cardNumber, int billingAddress,
			int customerID) {

	}

}
