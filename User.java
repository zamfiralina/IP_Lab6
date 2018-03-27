
import java.util.Vector;

public class User {

    public String EmailAdress = new String();

    public String Password = new String();

    public EmailManager Emails = new EmailManager();


    public void createNewEmail(String subject,String text,User sentTo) {
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
        Emails = emails;
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

    public EmailManager getEmails() {
        return Emails;
    }

    public void setEmails(EmailManager emails) {
        Emails = emails;
    }
}