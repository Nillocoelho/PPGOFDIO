package com.dio.design.decorator;
public class MilkDecorator implements Coffee {
    private final Coffee inner;
    public MilkDecorator(Coffee c) { this.inner = c; }
    public String getDescription() { return inner.getDescription() + ", milk"; }
    public double cost() { return inner.cost() + 0.5; }
}
