package EntityManagers;

import Entitys.Product;

public interface ProductManager {
	
//Create Methods 
	public Product addProduct(Product Product);
	
	
//Read Methods 
	public Product displayProductInformation(Product Product);
	public Product findByID (int ID);


//Update Methods 
	public Product updateProduct(Product Product);
	

//Delete Methods
	public Product deleteProduct(Product Product);
	

}
