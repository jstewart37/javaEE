package controllers;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("search")
@RequestScoped
public class AlexTestSearch {

		
		@Inject
		private SearchService searchService;
		@Inject
		private SelectedProduct selectedProduct;
		@Inject
		private SearchResults ControllersearchResults;
		privateString term;
	
		public String search(){
			List<ProductItem> results= searchService.searchBy(term);
			if(results!= null)
			if(results.size() == 1) {
				selectedProduct.setProduct(results.get(0));
				return"product";
			} else{
				searchResults.setResults(results);
				return"searchResults";
			}
				return"browse";
			}
			public String getTerm() { returnterm; }
			public void setTerm(String term) { this.term= term; }
	
	
	
}






