package services;


import java.util.ArrayList;

/**
 * @author Jake_Stewart
 */

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.context.*;
import javax.inject.Inject;
import javax.inject.Named;

import EntityManagers.*;
import Entitys.*;

@SessionScoped
public class AccountDetailsService {
	
	private CustomerManager customerManager;

	public  Customer findByemail(String Email) {
		
		Customer customer = customerManager.findByEmail(Email.toLowerCase());
			
		return customer;
		
	}	
	
	@Named("message")
	@RequestScoped
	public class MessageController {
		@Inject
//		private MessageService messageService;
		private String message = "";
		
	//	public String getLastMessage() {
//			return messageService.findLast();
		}
	//	public String getMessage() {
//			return message;
//		}
		public void setMessage(String message) {
//			this.message = message;
		}
		
		public String submitMessage(){
//			if(!messageService.validateMessage(message))
//				messageService.validateMessage("Please no rude words");
			return "index";
		}
	}	
	
//}