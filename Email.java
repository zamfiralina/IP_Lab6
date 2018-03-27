public class Email {

    public String Subject = new String();

    public String Text = new String();

    public User SendTo = new User();

    public User Sender = new User();

    public Email(String subject, String text, User sendTo) {
        Subject = subject;
        Text = text;
        SendTo = sendTo;
    }

    public void saveAsDraft() {
        Sender.getEmailManager().addDrafts(this);
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public User getSendTo() {
        return SendTo;
    }

    public void setSendTo(User sendTo) {
        SendTo = sendTo;
    }
}