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
	
	
	
	public List<Product> findByKeyword(String term) {
		List<Product> results = new ArrayList<>();
		results.addAll(searchByProductName(term));
		for(Product product : searchByProductDescription(term))
			if(!results.contains(product))
				results.add(product);
		return results;
	}

	private List<Product> searchByProductName(String name) {
		return productRepository.findByNameLike(name);
	}
		
	private List<Product> searchByProductDescription(String description) {
		return productRepository.findByDescriptionLike(description);
	}

	/*public List<Product> searchBy(String term) {
		List<Product> results = new ArrayList<>();
		if(term.matches("[0-9]")) {
			Product result = productService.findProductById(term);
			if(result != null)
				results.add(result);
		}		
		results.addAll(searchByProductName(term));
		results.addAll(searchByProductDescription(term));
		if(results.isEmpty())
			return null;
		List<Product> productItems = new ArrayList<>();
		results.forEach(product->{
			productItems.add(productService.getProduct(product, product.getId()));
		});
		return productItems;*/
	}