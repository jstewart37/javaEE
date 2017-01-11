package services;

import java.util.Properties;

import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Default;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * A class for sending mail messages.
 * @author Jake Stewart
 */
@RequestScoped
public class MailService {

    /**
     * Sends a subject and message to a recipient
     * @param recipient Internet address of the recipient
     * @param subject the subject of the message
     * @param message the message
     * @throws MessagingException
     */
    public static void sendMessage(String name,String email, String subject, String message) throws MessagingException {
    	System.out.println("Ran Method");
        if ( theService == null ) {
            theService = new MailService();
        }

        MimeMessage mimeMessage = new MimeMessage(mailSession);

        mimeMessage.setFrom(new InternetAddress(FROM));
		mimeMessage.setSender(new InternetAddress(FROM));
		mimeMessage.setSubject(subject + " - " + email);
        mimeMessage.setContent(message, "text/plain");

        mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(TO));
        mimeMessage.addRecipient(Message.RecipientType.BCC, new InternetAddress(email));

        Transport transport = mailSession.getTransport("smtps");
        transport.connect(HOST, PORT, USER, PASSWORD);

        transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
       // transport.sendMessage(mimeMessage, mimeMessage.getRecipients(Message.RecipientType.BCC));

        transport.close();
 
    }

    public MailService() {
        Properties props = new Properties();

        props.put("mail.transport.protocol", "smtps");
        props.put("mail.smtps.host", HOST);
        props.put("mail.smtps.auth", "true");
        props.put("mail.smtp.from", FROM);
        props.put("mail.smtps.quitwait", "false");

        mailSession = Session.getDefaultInstance(props);
        mailSession.setDebug(true);
    }

    private static MailService theService = null;

    private static Session mailSession;

    private static final String HOST = "smtp.gmail.com";
    private static final int PORT = 465;
    private static final String USER = "alstock957@gmail.com";     // alstock957@gmail.com, password nbgardens
    private static final String PASSWORD = "nbgardens"; 
    private static final String FROM = "alstock957@gmail.com"; // Full info for user, e.g. "Fred Smith <smit0012@d.umn.edu>"
    private static final String TO = "alstock957@gmail.com"; 	// TO User"
}