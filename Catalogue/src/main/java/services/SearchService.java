package services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Entitys.Product;
import EntityManagers.ProductManager;



@Stateless
public class SearchService {
	@Inject
	private ProductManager productRepository;
	@Inject
	private ProductService productService;
	
	@Deprecated
	public List<Product> findByKeyword(String term) {
		List<Product> results = new ArrayList<>();
		results.addAll(searchByProductName(term));
		for(Product product : searchByProductDescription(term))
			if(!results.contains(product))
				results.add(product);
		return results;
	}

	private List<Product> searchByProductName(String name) { // aye
		return productRepository.findByNameLike(name);
	}
		
	private List<Product> searchByProductDescription(String description) { // no
		return productRepository.findByDescriptionLike(description);
	}
	
	private List<Product> searchByCategory(String category) { // no
		return productRepository.findByCategory(category);
	}
	
	private List<Product> searchByColour(String colour) { // no
		return productRepository.findByColourlike(colour);
	}

	public List<Product> searchBy(String term) {
		List<Product> results = new ArrayList<>();
		if(term.matches("[0-9]")) {
			Product result = productService.findProductById(term);	// finds a product based on id
			if(result != null)
				results.add(result); // adds that product to the arraylist
		}		
		results.addAll(searchByProductName(term));
		results.addAll(searchByProductDescription(term));
		results.addAll(searchByCategory(term));
		results.addAll(searchByColour(term));
		if(results.isEmpty())
			return null;
		List<Product> productItems = new ArrayList<>();
		results.forEach(product->{
			productItems.add(productService.getProduct(product.getIdProduct()));
		});
		return productItems;
	}
	
	public List<Product> searchByCat(String term) {
		List<Product> results = new ArrayList<>();
		results.addAll(searchByCategory(term));
		if(results.isEmpty())
			return null;
		List<Product> productItems = new ArrayList<>();
		results.forEach(product->{
			productItems.add(productService.getProduct(product.getIdProduct()));
		});
		return productItems;
	}
	

}