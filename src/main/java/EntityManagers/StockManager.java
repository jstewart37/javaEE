package EntityManagers;

import java.util.List;

import Entitys.Stock;

/**
 * This is the entity manager for the stock entity
	 * @Author(author="Jake")
	 */

public interface StockManager {
	/**
	 * Finds a specific stock line
	 * 
	 * @param id
	 * @return
	 */
	public Stock findById(long id);
	
	/**
	 * Finds all active stock lines
	 * 
	 * @return
	 */
	public List<Stock> findByActive();
}