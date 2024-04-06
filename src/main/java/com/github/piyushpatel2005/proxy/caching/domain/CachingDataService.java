package com.github.piyushpatel2005.proxy.caching.domain;

import java.util.HashMap;
import java.util.Map;

public class CachingDataService implements DataSource{
    private DataSource dataSource;
    private Map<String, String> cache;

    public CachingDataService(String url) {
        this.dataSource = new DataService(url);
        this.cache = new HashMap<>();
    }

    @Override
    public String get(String key) {
        if (cache.containsKey(key)) {
            System.out.println("Fetching data from the cache for key " + key);
            return cache.get(key);
        } else {
            String value = dataSource.get(key);
            cache.put(key, value);
            return value;
        }
    }
}
