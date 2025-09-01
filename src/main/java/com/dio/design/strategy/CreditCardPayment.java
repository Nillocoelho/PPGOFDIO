package com.dio.design.strategy;
public class CreditCardPayment implements PaymentStrategy {
    private final String card;
    public CreditCardPayment(String card) { this.card = card; }
    public void pay(double amount) { System.out.println("Paid " + amount + " with card " + card); }
}
