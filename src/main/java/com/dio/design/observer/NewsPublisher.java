package com.dio.design.observer;
import java.util.*;
public class NewsPublisher implements Publisher {
    private final List<Subscriber> subs = new ArrayList<>();
    public void register(Subscriber s) { subs.add(s); }
    public void unregister(Subscriber s) { subs.remove(s); }
    public void notifyAllObservers(String news) { subs.forEach(s -> s.update(news)); }
    public void postNews(String news) { System.out.println("Publishing: " + news); notifyAllObservers(news); }
}
