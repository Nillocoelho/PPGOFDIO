package com.dio.design.proxy;
public class ExpensiveService {
    public String fetch() {
        try { Thread.sleep(500); } catch (InterruptedException e) {}
        return "Expensive Data from remote";
    }
}
