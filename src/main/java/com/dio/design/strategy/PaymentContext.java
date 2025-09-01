package com.dio.design.strategy;
public class PaymentContext {
    private PaymentStrategy strategy;
    public PaymentContext(PaymentStrategy s) { this.strategy = s; }
    public void setStrategy(PaymentStrategy s) { this.strategy = s; }
    public void pay(double amount) { strategy.pay(amount); }
}
