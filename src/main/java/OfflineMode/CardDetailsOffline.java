package OfflineMode;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import EntityManagers.CardDetailsManager;
import Entitys.CardDetails;
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

}
