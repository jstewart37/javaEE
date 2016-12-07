package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.

		RequestScoped;
import javax.inject.*;

import services.SearchService;

import Entitys.*;

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
	
	List<Product> results = new ArrayList<>();

	public String search() {
		results = searchService.findByKeyword(term);
		if (results != null) { // added {
				return "catalogue";
			}
		return "catalogue";
		}
		
	// end of 1st if

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}
}
