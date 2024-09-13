package Junit.Hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CacheServiceTest {

//    @Test
//    void getCachedDataTest() {
//        // Mock
//        ExternalCache externalCache = mock(ExternalCache.class);
//
//        // Stub
//        when(externalCache.getCacheValue("123")).thenReturn("cachedValue");
//
//        // Inject
//        CacheService cacheService = new CacheService(externalCache);
//
//        // Assert
//        assertEquals("cachedValue" , cacheService.getCachedData("123"));
//
//        // Verify
//        verify(externalCache , times(1)).getCacheValue("123");
//    }

    @Test
    public void cacheServiceTest() {
        // Mock
        ExternalCache externalCache = mock(ExternalCache.class);

        // Stub
        when(externalCache.getCacheValue("123")).thenReturn("cachedValue");

        // Inject
        CacheService cacheService = new CacheService(externalCache);

        // Assert
        assertEquals("cachedValue" , cacheService.getCachedData("123"));
    }
}