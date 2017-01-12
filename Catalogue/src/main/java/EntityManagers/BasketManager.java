package EntityManagers;

import java.util.List;

import Entitys.Product;
import Entitys.Stock;

public interface BasketManager {

		/**
		 * Finds a customers basket
		 * 
		 * @param id
		 * @return
		 */
		List<Product> findByCustomerId(long id);
		
		/**
		 * Updates a customers basket.
		 * 
		 * @param customerId
		 * @param wishlist
		 */
		void updateBasketList(long customerId, List<Product> basketList);

	}

