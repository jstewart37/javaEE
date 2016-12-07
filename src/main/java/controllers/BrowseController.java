package controllers;

import java.io.Serializable;

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
	private DataModel<Product> products = null;

	private void recreateModel() {
		products = null;
	}

	public DataModel<Product> getProducts() {
		return (DataModel<Product>) getPagination().createPageDataModel();
	}

	public PaginationHelper getPagination() {
		if (pagenationHelper == null) {
			pagenationHelper = new PaginationHelper(9) {
				@Override
				public int getItemsCount() {
					return productService.findAllActive().size();
				}
				@Override
				public DataModel<Product> createPageDataModel() {
					try {
						return new ListDataModel<Product>(productService.findAllActive().subList(getPageFirstItem(),
								getPageFirstItem() + getPageSize()));
					} catch (Exception e) {
						return new ListDataModel<Product>(productService.findAllActive().subList(getPageFirstItem(), getItemsCount()));
					}
				}
			};
		}
		return pagenationHelper;
	}

	public String next() {
		getPagination().nextPage();
		recreateModel();
		return "browse";
	}

	public String previous() {
		getPagination().previousPage();
		recreateModel();
		return "browse";
	}

}