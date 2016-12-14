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
	private List<Product> basketList = null;;

	/**
	 * Adds the specified product to the wishlist
	 * 
	 * @param id the ID of the product to add to the wishlist.
	 */
	public void add(long id) {
		if(user.isloggedIn())
			basketService.add(user.getCustomer().getIdCustomer(), id);
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
	public List<Product> getbasketList() {
		System.out.println("GETTING B ASKET LIST.");
		if(basketList==null)
			System.out.println("it's null");
			basketList = basketService.getBasketlist(user.getCustomer().getIdCustomer());
		return basketList;
	}
}
