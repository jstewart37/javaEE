package controllers;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.mail.MessagingException;
import services.MailService;

/**
 * A bean class that sends an email message
 * @author Jake Stewart
 */
@Named("EmailController")
@SessionScoped
public class EmailController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private MailService mailService;
	
	
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getStatusMessage() {
        return statusMessage;
    }
    
    public String send() {
        statusMessage = "Message Sent";
        try {
        	System.out.println("1");
        	MailService.sendMessage(name,email, subject, message);
        	System.out.println("2");
        }
        catch(MessagingException ex) {
            statusMessage = ex.getMessage();
        }
        return "index";  // redisplay page with status message
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String email;
	private String subject;
    private String message;
    private String statusMessage = "";
    private String name;
 
} 