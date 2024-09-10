package Junit.Hard;

public class OrderService {
    public boolean processOrder(String orderId) {
        // Simulate external API call
        ExternalOrderService externalOrderService = new ExternalOrderService();
        return externalOrderService.validateOrder(orderId);
    }
}

class ExternalOrderService {
    public boolean validateOrder(String orderId) {
        // External service logic here
        return true;
    }
}

