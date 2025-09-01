package com.dio.design.singleton;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class Settings {
    private static final Settings INSTANCE = new Settings();
    private final Map<String,String> store = new ConcurrentHashMap<>();

    private Settings() {}

    public static Settings getInstance() { return INSTANCE; }

    public void set(String k, String v) { store.put(k,v); }
    public String get(String k) { return store.get(k); }
}
