package com.dio.design.proxy;
public class ServiceProxy {
    private final ExpensiveService real;
    private String cache;
    public ServiceProxy(ExpensiveService real) { this.real = real; }
    public String fetch() {
        if (cache==null) cache = real.fetch();
        return cache;
    }
}
