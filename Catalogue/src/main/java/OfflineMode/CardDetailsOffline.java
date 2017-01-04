package OfflineMode;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import EntityManagers.CardDetailsManager;
import Entitys.CardDetails;
import Entitys.Customer;
import Entitys.TestData;

@Stateless
@Default

public class CardDetailsOffline implements CardDetailsManager {
	@Inject
	private TestData testData;
	
	@Override
	public CardDetails createNewCardDetails(CardDetails cardDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CardDetails updateCardDetails(CardDetails cardDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CardDetails removeCardDetails(CardDetails cardDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CardDetails> findByCustomerId(long idCustomer) {
		for(Customer customer : testData.getCustomers())
			if(customer.getIdCustomer() == idCustomer)
				return customer.getCardList();
		return null;

	}

}
