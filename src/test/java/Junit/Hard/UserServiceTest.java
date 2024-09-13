package Junit.Hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceTest {
    /**
    // for constructor inject
    @Test
    void testGetUserById() {
        User user = new User(1, "John Doe");
        // Mock
        UserDatabase userDatabase = mock(UserDatabase.class);

        // Stub
        when(userDatabase.findUserById(1)).thenReturn(user);

        // Inject
        UserService userService = new UserService(userDatabase);

        User result = userService.getUserById(1);
        // Assert
        assertEquals(1 , result.getId());
        assertEquals("John Doe" , result.getName());
    }

    // for constructor inject
    @Test
    void testGetUserById() {
        User user = new User(1, "John Doe");
        // Mock
        UserDatabase userDatabase = mock(UserDatabase.class);

        // Stub
        when(userDatabase.findUserById(1)).thenReturn(user);

        // Inject
        UserService userService = new UserService();
        userService.setUserDatabase(userDatabase);

        User result = userService.getUserById(1);
        // Assert
        assertEquals(1 , result.getId());
        assertEquals("John Doe" , result.getName());
    }
    */

}