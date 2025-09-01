package com.dio.design.command;
public class Light {
    private boolean on = false;
    public void toggle() { on = !on; System.out.println("Light is now " + (on?"ON":"OFF")); }
}
