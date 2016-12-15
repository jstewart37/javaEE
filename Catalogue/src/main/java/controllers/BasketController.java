package controllers;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Entitys.Product;
import services.BasketService;

/**
 * This controller handles the wishlist functionality.
 * 
 * @author James Thompson
 *
 */
@Named("basketList")
@RequestScoped
public class BasketController {
	@Inject
	private BasketService basketService;
	@Inject
	private CurrentUser user;
	private List<Product> basket = null;;

	/**
	 * Adds the specified product to the wishlist
	 * 
	 * @param id the ID of the product to add to the wishlist.
	 */
	public void add(long id) { // passes is ID of product
		System.out.println("adding a product step one. I've pushed buy yo shit");
		if(user.isloggedIn())
			basketService.add(user.getCustomer().getIdCustomer(), id);
		System.out.println("I've finished adding a product to the customers basket.");
		checkCustList(id, user.getCustomer().getBasketlist());
		
		
	}
	
	
	public void checkCustList(long id, List<Product> basket){
		System.out.println("I'm a customer my ID is " + id );
		System.out.println("I have this in my basket");
		for(Product product : basket)	System.out.println(product.getName());
	}
	
	
	
	
	
	
	/**
	 * removes the specified product from the wishlist
	 * 
	 * @param id the product to remove
	 * @return returns wishlist
	 */
	public String removeItem(long id) {
		basketService.removeFromBasketlist(user.getCustomer().getIdCustomer(), id);
		return "basket";
	}
	
	/**
	 * Selects the wishlist for the sessions user.
	 * 
	 * @return the list of products in the wishlist.
	 */
	public List<Product> getbasket() {
		System.out.println("GETTING B ASKET LIST.");
		if(basket==null){
			System.out.println("it's null");
			basket = basketService.getBasketlist(user.getCustomer().getIdCustomer());
		}
		return basket;
	}
}
