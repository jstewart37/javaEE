package EntityManagers;

import java.util.List;

import Entitys.Product;
import Entitys.Stock;

public interface BasketManager {

		/**
		 * Finds a customers wishlist
		 * 
		 * @param id
		 * @return
		 */
		List<Product> findByCustomerId(long id);
		
		/**
		 * Updates a customers wishlist.
		 * 
		 * @param customerId
		 * @param wishlist
		 */
		void updateWishList(long customerId, List<Product> wishlist);
	}

