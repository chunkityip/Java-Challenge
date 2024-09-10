package Junit.Hard;

public class CacheService {
    public String getCachedData(String key) {
        ExternalCache externalCache = new ExternalCache();
        return externalCache.getCacheValue(key);
    }
}

class ExternalCache {
    public String getCacheValue(String key) {
        return "cachedValue";
    }
}

