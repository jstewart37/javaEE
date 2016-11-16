import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="supplyOrder")
public class SupplyOrder {

	// variables
	
	@Id	@Column (name="idSupplyOrder", nullable=false, unique=true) @GeneratedValue(strategy=GenerationType.IDENTITY) private long idSupplyOrder;
	@Column(nullable=false, length=20)	@Size(max=225) @NotNull	private String status;
	@Column(nullable=false, length=50)	@Size(max=225) @NotNull	private String dateTimePlaced;
	@Column(nullable=false, length=50)	@Size(max=225) @NotNull	private String dateTimeRecieved;
	// private String supplierid;
	
	// constructors
	public SupplyOrder(long idSupplyOrder, String status, String dateTimePlaced, String dateTimeRecieved)
	{
		
	}
	;
	
	// getters and setters
	
}
