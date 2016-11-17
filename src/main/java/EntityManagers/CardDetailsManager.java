package EntityManagers;

import Entitys.CardDetails;
import antlr.collections.List;

public interface CardDetailsManager {

	public  CardDetails findByNameOnCard(String nameOnCard); //find customer card by searching for cust name.
	public CardDetails createNewCard(CardDetails cardDetails);
	
	public  List findByCustomerName(String nameOnCard);
	public void updateCardDetails(String nameOnCard, String cardNumber, String accountNumber, String sortCode ) ;
}
