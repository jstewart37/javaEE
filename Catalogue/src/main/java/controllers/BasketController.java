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
@Named("wishlist")
@RequestScoped
public class BasketController {
	@Inject
	private BasketService basketService;
	@Inject
	private CurrentUser user;
	private List<Product> basketList;

	/**
	 * Adds the specified product to the wishlist
	 * 
	 * @param id the ID of the product to add to the wishlist.
	 */
	public void addToWishlist(long id) {
		if(user.isloggedIn())
			basketService.addToWishlist(user.getCustomer().getIdCustomer(), id);
	}
	
	/**
	 * removes the specified product from the wishlist
	 * 
	 * @param id the product to remove
	 * @return returns wishlist
	 */
	public String removeItem(long id) {
		basketService.removeFromWishlist(user.getCustomer().getIdCustomer(), id);
		return "wishlist";
	}
	
	/**
	 * Selects the wishlist for the sessions user.
	 * 
	 * @return the list of products in the wishlist.
	 */
	public List<Product> getWishlist() {
		if(basketList==null)
			basketList = basketService.getWishlist(user.getCustomer().getIdCustomer());
		return basketList;
	}
}
