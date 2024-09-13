package Junit.Hard;

public class EmailService {

    private EmailProvider emailProvider;

    public EmailService (EmailProvider emailProvider) {
        this.emailProvider = emailProvider;
    }



    public boolean sendEmail(String recipient, String message) {
        EmailProvider emailProvider = new EmailProvider();
        return emailProvider.send(recipient, message);
    }
}

class EmailProvider {
    public boolean send(String recipient, String message) {
        return true;
    }
}

