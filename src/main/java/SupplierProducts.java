import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Supplier Products")
public class SupplierProducts {
	
	//constructors
	public SupplierProducts() {
		
	}
	
	//getters and setters
	
	public int getProductId(){
		return Product.idProduct;
	}
	
	public int getSupplierId(){
		return Supplier.idSupplier;
	}

}
