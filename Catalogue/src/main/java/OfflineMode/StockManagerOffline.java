package OfflineMode;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import EntityManagers.StockManager;
import Entitys.Stock;

@Stateless
@Default
public class StockManagerOffline implements StockManager {

	@Override
	public Stock findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Stock> findByActive() {
		// TODO Auto-generated method stub
		return null;
	}

}
