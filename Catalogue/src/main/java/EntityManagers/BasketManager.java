package EntityManagers;

import java.util.List;

import Entitys.Stock;

public interface BasketManager {

		/**
		 * Finds a customers wishlist
		 * 
		 * @param id
		 * @return
		 */
		List<Stock> findByCustomerId(long id);
		
		/**
		 * Updates a customers wishlist.
		 * 
		 * @param customerId
		 * @param wishlist
		 */
		void updateWishList(long customerId, List<Stock> wishlist);
	}

