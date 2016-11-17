package EntityManagers;

import Entitys.Product;

public interface ProductManager {
	
//////////////////////////QUERY STUBS/////////////////////////////////
	
	public Product findProductbyName(String name);
	public Product findByID (int ID);
	public Product findByDescription (String Description);
	public Product findByStatus (String Status);
	public Product findByColour (String Colour);
	public Product findByPorouseware (String isPorous);
	
///////////////////////////////CRUD///////////////////////////////////
	
//Create Methods 
	public Product addProduct(Product Product);
	
	
//Read Methods 
	public Product displayProductInformation(Product Product);
	


//Update Methods 
	public Product updateProduct(Product Product);
	

//Delete Methods
	public Product deleteProduct(Product Product);
	

}
