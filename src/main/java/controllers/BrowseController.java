package controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ConversationScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import Entitys.Product;
import services.ProductService;

@Named("browse")
@ConversationScoped
public class BrowseController implements Serializable {

	@Inject
	private ProductService productService;
	private PaginationHelper pagenationHelper;
	private List<Product> product = null;

	private void recreateModel() {
		product = null;
	}

	public PaginationHelper getPaginationHelper() {
		if (pagenationHelper == null) {
			pagenationHelper = new PaginationHelper(9) {
				@Override
				public int getItemsCount() {
					return productService.findAllActive().size();
				}

				@Override
				public ListDataModel<Product> createPageDataModel() {
					try {
						return new ListDataModel<Product>(productService.findAllActive().subList(getPageFirstItem(),getPageFirstItem() + getPageSize()));
					} catch (Exception e) {
						return new ListDataModel<Product>(productService.findAllActive().subList(getPageFirstItem(), getItemsCount()));
					}
				}
			};
		}
		return pagenationHelper;
	}

	public String next() {
		getPaginationHelper().nextPage();
		recreateModel();
		return "browse";
	}

	public String previous() {
		getPaginationHelper().previousPage();
		recreateModel();
		return "browse";
	}



	public List<Product> getProduct() {
		product = productService.findAll();
		return product;
	}
	
	@SuppressWarnings("unchecked")
	public List<Product> getDataModel() {
		return (List<Product>) getPaginationHelper().createPageDataModel();
}

}