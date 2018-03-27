import java.util.Vector;

public class EmailManager {

    public Vector<Email> sentEmails = new Vector<>();

    public Vector<Email> receivedEmails = new Vector<>();

    public Vector<Email> Drafts = new Vector<>();

    public void viewEmail(Email email) {

    }

    public EmailManager() {}

    public EmailManager(Vector<Email> sentEmails, Vector<Email> receivedEmails, Vector<Email> drafts) {
        this.sentEmails = sentEmails;
        this.receivedEmails = receivedEmails;
        Drafts = drafts;
    }

    public Vector<Email> getSentEmails() {
        return sentEmails;
    }

    public void setSentEmails(Vector<Email> sentEmails) {
        this.sentEmails = sentEmails;
    }

    public Vector<Email> getReceivedEmails() {
        return receivedEmails;
    }

    public void setReceivedEmails(Vector<Email> receivedEmails) {
        this.receivedEmails = receivedEmails;
    }

    public Vector<Email> getDrafts() {
        return Drafts;
    }

    public void setDrafts(Vector<Email> drafts) {
        Drafts = drafts;
    }

    public void addDrafts(Email email) {
        Drafts.add(email);
    }
}