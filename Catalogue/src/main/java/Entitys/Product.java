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
	
	@Column(nullable = false, length = 45)
	@NotNull
	private String category;

	//constructors
	@Author(author = "alex")
	public Product(long vidProduct, String vname, String vdescription, String vcolour, int vstockLevel, double vsellPrice, double vbuyPrice, // all variables
			String vstatus, String path, String pw, String cat) {
		
		this.idProduct = vidProduct;
		this.name = vname;
		this.description = vdescription;
		this.colour= vcolour;
		this.stockLevel= vstockLevel;
		this.sellPrice= vsellPrice;
		this.buyPrice= vbuyPrice;
		this.status= vstatus;
		this.imgPath = path;
		this.isPorousware = pw;	
		this.category = cat;
	}

	//getters & setters

	public Product(long id) {
		this.idProduct = id;
	}

	public Product(int id, String name) {
		idProduct = id;
		this.name = name;
	}

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


	@Author(author = "alex")
	public void addProductInfo(String vname, String vdescription, String vcolour, double vsellPrice,
			String vstatus, String vimgPath, String cat) {
		this.name = vname;
		this.description = vdescription;
		this.colour= vcolour;
		this.sellPrice= vsellPrice;
		this.status= vstatus;
		this.imgPath= vimgPath;
		this.category = cat;
	}

	@Author(author = "alex")
	public void addStockInfo(String vname, String vdescription, String vcolour, int vstockLevel, double vsellPrice,
			double vbuyPrice, String vstatus, String vimgPath, String cat) {
		this.name = vname;
		this.description = vdescription;
		this.colour= vcolour;
		this.stockLevel= vstockLevel;
		this.sellPrice= vsellPrice;
		this.buyPrice= vbuyPrice;
		this.status= vstatus;
		this.imgPath= vimgPath;
		this.category = cat;
		
	}

	public String getImgPath() {
		
		return this.imgPath;
	}

	public String getCategory() {
		return this.category;
	}

}