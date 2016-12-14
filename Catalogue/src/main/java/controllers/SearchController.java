package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.

		RequestScoped;
import javax.inject.*;

import services.SearchService;

import Entitys.*;
import controllers.Session.SelectedProduct;

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
	
	/**
	 * Handles the searching of the catalogue using the term set via setTerm()
	 * 
	 * @return returns searchResults for the list of results or product if a single product was found. returns browse if none were found
	 */
	public String search(){
		List<Product> results = searchService.searchBy(term);
		if (results != null)
			if (results.size() == 1) {	// only one product found in search, directs you to the product page instead of the browse page.
				selectedProduct.setProduct(results.get(0));
				return "product";
			} else {
				searchResults.setResults(results);	
				return "searchResults";
			}
		return "browse"; // all prods
	}

	public String getTerm() { 
		
		
		
		return term; }
	public void setTerm(String term) { this.term = term; }
}