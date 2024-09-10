package Junit.Hard;

public class EmailService {
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

