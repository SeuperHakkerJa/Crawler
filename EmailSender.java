import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;


public class EmailSender {
  public static void main(String[] args) {
    String recipient = "x1li@ucsd.edu";
    String sender = "xlijacob@gmail.com";
    String host = "localhost";

    Properties properties = System.getProperties();
    properties.setProperty("mail.smtp.host", host);

    Session session = Session.getDefaultInstance(properties);

    try {
      MimeMessage message = new MimeMessage(session);
      message.setFrom(new InternetAddress(sender));
      message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
      //message.addRecipients(Message.RecipientType.TO, new Address[...]); //
      // email to multiple recipients
      message.setSubject("Hello World!");
      message.setText("And hello from the body of the message!");

      Transport.send(message);

    } catch (AddressException e) {
      e.printStackTrace();
    } catch (MessagingException e) {
      e.printStackTrace();
    }
  }
}