package controllers;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Entitys.Product;
import services.BasketService;

@Named("basketList")
@RequestScoped
public class BasketController {
	@Inject
	private BasketService basketService;
	@Inject
	private CurrentUser user;
	private List<Product> basket = null;;

	public void add(long id) { // passes is ID of product
		if(user.isloggedIn())
			basketService.add(user.getCustomer().getIdCustomer(), id);
	}
		
	public String removeItem(long id) {
		basketService.removeFromBasketlist(user.getCustomer().getIdCustomer(), id);
		return "basket";
	}
	
	public List<Product> getbasket() {
		if(basket==null){
			basket = basketService.getBasketlist(user.getCustomer().getIdCustomer());
		}
		return basket;
	}
}
