import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Product")
public class Product {

	@Id
	@Column(name="idProduct", nullable =false, unique=true)
	GeneratedValue (strategy=GenerationType.IDENTITY)
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
	
	public Product (String name, String description, String colour,
			int stockLevel, double sellPrice, double buyPrice, 
			String status, String imgPath){}


	public int getIdProduct() {
		return idProduct;
	}


	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public int getStockLevel() {
		return stockLevel;
	}


	public void setStockLevel(int stockLevel) {
		this.stockLevel = stockLevel;
	}


	public double getSellPrice() {
		return sellPrice;
	}


	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}


	public double getBuyPrice() {
		return buyPrice;
	}


	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getImgPath() {
		return imgPath;
	}


	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	
	
	
	
	//TODO getters & setters
}
