@Entity
@Table (name="Product")
public class Product {

	@idProduct
	@Column(name="idProduct", nullable =false, unique=true)
	GeneratedValue(stategy=GenerationType.IDENTITY)
	private int idProduct;
	
	
	
	private String name;
	private String description;
	private String colour;
	private int stockLevel;
	private double sellPrice;
	private double buyPrice;
	private String status;
	private String imgPath;
	
	
	//TODO constructors
	
	//TODO getters & setters
}
