import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="customers")
public class Customer {
	
	// variables
	
	@Id	@Column (name="idCustomer", nullable=false, unique=true) @GeneratedValue(strategy=GenerationType.IDENTITY) private long idCustomer;
	@Column(nullable=false, length=15)	@Size(max=225) @NotNull	private String title;
	@Column(nullable=false, length=100)	@Size(max=225) @NotNull private String name;
	@Column(nullable=false, length=150)	@Size(max=225) @NotNull private String email;
	@Column(nullable=false, length=20)	@Size(max=225) @NotNull private String phone;
	
	// constructors
	public Customer(long idCustomer, String title, String name, String email, String phone)
	{
		
	}
	;
	
	// getters and setters
	
}
