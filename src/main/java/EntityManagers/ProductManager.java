package EntityManagers;

import Entitys.Product;

public interface ProductManager {
	
//////////////////////////QUERY STUBS/////////////////////////////////
	
	public Product findProductbyName(String name);
	
	
	
	
///////////////////////////////CRUD///////////////////////////////////
	
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
