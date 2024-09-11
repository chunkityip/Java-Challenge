package Junit.Hard;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderService {
    private ExternalOrderService externalOrderService;

    /*
    // Setter injection
    @Autowired
    public void setExternalOrderService(ExternalOrderService externalOrderService) {
        this.externalOrderService = externalOrderService;
    }

    public boolean processOrder(String orderId) {
        return externalOrderService.validateOrder(orderId);
    }
     */

    // Constructor injection
    @Autowired
    public OrderService(ExternalOrderService externalOrderService) {
        this.externalOrderService = externalOrderService;
    }

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

