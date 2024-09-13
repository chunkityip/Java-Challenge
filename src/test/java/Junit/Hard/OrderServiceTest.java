package Junit.Hard;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OrderServiceTest {
    /**
    @Test
    @DisplayName("This is for Constructor Dependency Injection")
    public void testProcessOrderAsConstructor() {
        ExternalOrderService externalOrderService = mock(ExternalOrderService.class);
        when(externalOrderService.validateOrder("123")).thenReturn(true);

        OrderService orderService = new OrderService(externalOrderService);

        assertTrue(orderService.processOrder("123"));
    }

    @Test
    @DisplayName("This is for Setter Dependency Injection")
    @Disabled
    public void testProcessOrderAsSetter() {
        ExternalOrderService externalOrderService = mock(ExternalOrderService.class);
        when(externalOrderService.validateOrder("123")).thenReturn(true);

        OrderService orderService = new OrderService();
        orderService.setExternalOrderService(externalOrderService);

        assertTrue(orderService.processOrder("123"));

    }
    */

    @Test
    public void testProcessOrder() {
        // Mock
        ExternalOrderService externalOrderService = mock(ExternalOrderService.class);

        // Stub
        when(externalOrderService.validateOrder("123"))
                .thenReturn(true);

        // Inject
        OrderService orderService = new OrderService(externalOrderService);

        // Assert
        assertTrue(orderService.processOrder("123"));
    }
}
