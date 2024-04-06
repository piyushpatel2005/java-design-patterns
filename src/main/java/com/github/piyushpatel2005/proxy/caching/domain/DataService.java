package com.github.piyushpatel2005.proxy.caching.domain;

public class DataService implements DataSource{
    private String url;

    public DataService(String url) {
        this.url = url;
    }

    @Override
    public String get(String key) {
        System.out.println("Fetching data from the data service for key " + key);
        return "Value " + key;
    }
}
