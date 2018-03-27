
import java.util.Vector;

public class User {

    public String EmailAdress = new String();

    public String Password = new String();

    public EmailManager EmailManager = new EmailManager();


    public Email createNewEmail(String subject,String text,User sentTo) {
        return new Email(subject, text, sentTo);

    }

    public void sentEmail(Email email) {

    }

    public User() {
        this.EmailAdress = new String();
        this.Password = new String();
    }

    public User(String emailAdress, String password, EmailManager emails) {
        EmailAdress = emailAdress;
        Password = password;
        EmailManager = emails;
    }

    public String getEmailAdress() {
        return EmailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        EmailAdress = emailAdress;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public EmailManager getEmailManager() {
        return EmailManager;
    }

    public void setEmailManager(EmailManager emails) {
        EmailManager = emails;
    }
}