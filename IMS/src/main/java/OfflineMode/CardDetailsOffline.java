package OfflineMode;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import EntityManagers.CardDetailsManager;
import Entitys.CardDetails;

@Stateless
@Default

public class CardDetailsOffline implements CardDetailsManager {
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
