package Junit.Hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PaymentProcessorTest {

//    @Test
//    void processPaymentTest() {
//        // Mock
//        PaymentGateway paymentGateway = mock(PaymentGateway.class);

        // Verify
//        verify(paymentGateway , times(1)).executePayment("123");
//
//        // Stub
//        when(paymentGateway.executePayment("123")).thenReturn(true);
//
//        // Inject
//        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);
//
//        boolean result = paymentProcessor.processPayment("123");
//
//        // Assert
//        assertTrue(result);
//    }
    @Test
    public void testProcessPayment() {

        // Mock
        PaymentGateway paymentGateway = mock(PaymentGateway.class);

        // Stub
        when(paymentGateway.executePayment("123")).thenReturn(true);

        // Inject
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);

        // Assert
        assertTrue(paymentProcessor.processPayment("123"));

        // Verity
        verify(paymentGateway , never()).executePayment("123");
    }

}