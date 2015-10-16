package za.co.reverside.insurance.service;

import java.util.Date;
import java.util.Properties;
import org.hibernate.engine.config.spi.ConfigurationService;
import org.springframework.stereotype.Service;
import javax.mail.*;
import javax.mail.internet.*;

@Service("mailService")
public class ENotificationService {

    private ConfigurationService config;
    private String from;
    private String message;
    private String subject;
    private String smtpServ;
    
    public int sendMail(String to, String title, String fname, String lname, long clientId ) {
         
        from = "elias.maluleka@reverside.co.za";
        message = "Hello " + " " + title + " " + fname + " " + lname + " \n"
                + "Thank you for making a claim, your claim has been received \n"
                + "click here to view you claim \n"
                + "http://localhost:8080/reverside/user.html#/claimDetails/"+clientId + "\n"
                + "You will be notified about your claim \n"
                + " \n"
                + "Regard \n"
                + "Administrator \n"
                + "Mr.S Hunger";
        subject = "Claim Notification";
        smtpServ = "smtp.gmail.com";
        
        try {
            System.out.println("[Start] email notification line 1");
            Properties props = System.getProperties();

            System.out.println("[Start] email notification line 2");
            Authenticator auth = new SmtpAuthenticator();

            System.out.println("[Start] email notification line 3");
            Session session = Session.getDefaultInstance(props, auth);

            System.out.println("[Start] email notification line 4");
            props.put("mail.transport.protocol", "smtp");

            System.out.println("[Start] email notification line 5 smtp");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", smtpServ);
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.fallback", "false");

            System.out.println("[Start] email notification line 6 props out");
            System.out.println(smtpServ);
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(from));

            System.out.println("[Start] email notification line 7");
            System.out.println(from);

            msg.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            System.out.println("[Start] email notification line 8");
            System.out.println(to);

            msg.setSubject(subject);
            msg.setText(message);
            msg.setHeader("Claim Posted", "Mr. XYZ");
            msg.setSentDate(new Date());

            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com", 465, "username", "password");
            Transport.send(msg);
            System.out.println("Message sent to" + to + " OK.");

            return 0;
        } catch (Exception err) {
            System.out.println("Error occure in sending mail " + err);
            return -1;
        }

    }

    public class SmtpAuthenticator extends Authenticator {

        public SmtpAuthenticator() {

            super();
        }

        @Override
        public PasswordAuthentication getPasswordAuthentication() {
            String username = "hunger.sithole@gmail.com";
            String password = "S.hunger/23";
            if ((username != null) && (username.length() > 0) && (password != null)
                    && (password.length() > 0)) {

                return new PasswordAuthentication(username, password);
            }

            return null;
        }
    }
}
