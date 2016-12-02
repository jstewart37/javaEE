package controllers;

import java.util.List;

import javax.enterprise.context.

RequestScoped;
import javax.inject.*;

@Named("search")
@RequestScoped
public class SearchController {
	@Inject
	private SearchService searchService;
	@Inject
	private SelectedProduct selectedProduct;
	@Inject
	private SearchResultsController searchResults;
	private String term;
	
	
	public String search(){
	List<Entitys.Product> results = searchService.searchBy(term);
	if (results != null){ //added {
		if (results.size() == 1) {selectedProduct.setProduct(results.get(0));
		return "product";
		} 
		else {searchResults.setResults(results);
		return "searchResults";}
	return "browse";
	}// end of 1st if
	}
	
	public String getTerm() { 
		return term; }
	
	public void setTerm(String term) {
	this.term = term; }
}

