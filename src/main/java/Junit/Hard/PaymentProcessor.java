package Junit.Hard;

public class PaymentProcessor {
    public boolean processPayment(String paymentId) {
        PaymentGateway paymentGateway = new PaymentGateway();
        return paymentGateway.executePayment(paymentId);
    }
}

class PaymentGateway {
    public boolean executePayment(String paymentId) {
        return true;
    }
}

