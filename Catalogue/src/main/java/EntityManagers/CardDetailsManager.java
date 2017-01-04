package EntityManagers;

import java.util.List;

import Entitys.Address;
import Entitys.CardDetails;

public interface CardDetailsManager {

	
	//CRUD Stubs
	public CardDetails createNewCardDetails(CardDetails cardDetails);
	public CardDetails updateCardDetails(CardDetails cardDetails);
	public CardDetails removeCardDetails(CardDetails cardDetails);
	public List<CardDetails> findByCustomerId(long idCustomer);

}
