package com.dio.design.observer;
public interface Publisher {
    void register(Subscriber s);
    void unregister(Subscriber s);
    void notifyAllObservers(String news);
}
