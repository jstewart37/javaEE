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
	@Inject
	private ProductController productController;

	private PaginationHelper pagination = null;
	private List<Product> products = null;

	private void recreateModel() {
		products = null;
	}
	
	public PaginationHelper getPagination() {
		if (pagination == null) {
			pagination = new PaginationHelper(9) {
				
				@Override
				public int getItemsCount() {
					return productService.findAll().size();
				}
				
				@Override
				public ListDataModel<Product> createPageDataModel() {
					try {
						return new ListDataModel<Product>(productService.findAll().subList(getPageFirstItem(),
								getPageFirstItem() + getPageSize()));
					} catch (Exception e) {
						return new ListDataModel<Product>(
								productService.findAll().subList(getPageFirstItem(), getItemsCount()));
					}
				}
			};
		}
		return pagination;
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

	public List<Product> getProducts() {
		products = productService.findAll();
		return products;
	}

	@SuppressWarnings("unchecked")
	public DataModel<Product> getDataModel() {
		return (DataModel<Product>) getPagination().createPageDataModel();
	}
	
	public Product getProduct(){
		return productController.getProduct();
}
}