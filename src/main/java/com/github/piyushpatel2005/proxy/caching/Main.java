package com.github.piyushpatel2005.proxy.caching;

import com.github.piyushpatel2005.proxy.caching.domain.CachingDataService;
import com.github.piyushpatel2005.proxy.caching.domain.DataSource;

public class Main {
    public static void main(String[] args) {
        DataSource cachedDataSource = new CachingDataService("http://someurl.com");
        System.out.println(cachedDataSource.get("key1"));
        System.out.println(cachedDataSource.get("key2"));
        System.out.println(cachedDataSource.get("key1"));
    }
}
