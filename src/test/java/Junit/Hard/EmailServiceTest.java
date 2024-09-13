package Junit.Hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class EmailServiceTest {

    @Test
    void testSendEmailTest() {
        // Mock
        EmailProvider emailProvider = mock(EmailProvider.class);

        // Stub
        when(emailProvider.send("recipient" , "message"))
                .thenReturn(true);

        // Inject
        EmailService emailService = new EmailService(emailProvider);

        // Assert
        assertTrue(emailService.sendEmail("recipient" , "message"));
    }
}