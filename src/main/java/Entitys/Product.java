package Entitys;
import javax.persistence.*;
import javax.validation.constraints.*;


@Embeddable
@Entity
@Table(name = "Product")
public class Product {

	@Id
	@Column(name="idProduct", nullable=false, unique=true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProduct;

	@Column(nullable = false)
	@NotNull
	private String name;

	@Column(nullable = false)
	@NotNull
	private String description;

	@Column(nullable = false)
	@NotNull
	private String colour;

	@Column(nullable = false)
	@NotNull
	private int stockLevel;

	@Column(nullable = false)
	@NotNull
	private double sellPrice;

	@Column(nullable = false)
	@NotNull
	private double buyPrice;
	
	@Column(nullable = false)
	@NotNull
	private String isPorousware;

	
	@Column(nullable = false)
	@NotNull
	private String status;

	@Column(nullable = false, length = 45)
	@NotNull
	private String imgPath;

	// TODO constructors
	public Product(String name, String description, String colour, int stockLevel, double sellPrice, double buyPrice,
			String status, String imgPath) {
	}

	// TODO getters & setters

	public long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		
	}
	public void setIdProduct(long idProduct) {

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

	
	public String getIsPorousware() {
		return isPorousware;
	}

	public void setIsPorousware(String isPorousware) {
		this.isPorousware = isPorousware;
	}

	
	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

}