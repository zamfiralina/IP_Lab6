import java.util.Vector;

public class Server {

    String validEmailAdress;
    String validPassword;

    public Server() {
        this.validEmailAdress = "adresa";
        this.validPassword = "parola";
    }

    public Boolean login(String emailAdress, String  password) {

        if ( Boolean.valueOf(String.valueOf(emailAdress.compareTo(this.validEmailAdress)))
                && Boolean.valueOf(String.valueOf(password.compareTo(this.validPassword))) )
            return true;

        return false;


    }

    public Boolean register(String emailAdress,String password) {

        if ( emailAdress.contains(" ") || emailAdress.contains("\n") || emailAdress.contains("  ")
                && !emailAdress.contains("@email.com") )
            return false;

        if ( Boolean.valueOf(String.valueOf(emailAdress.compareTo(this.validEmailAdress))) )
            return false;

        this.validPassword = password;
        this.validEmailAdress = emailAdress;

        return true;

    }



}