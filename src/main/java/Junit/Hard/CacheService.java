package Junit.Hard;

public class CacheService {
    private ExternalCache externalCache;

    public CacheService(ExternalCache externalCache) {
        this.externalCache = externalCache;
    }

    public String getCachedData(String key) {
        return externalCache.getCacheValue(key);
    }
}

class ExternalCache {
    public String getCacheValue(String key) {
        return "cachedValue";
    }
}

