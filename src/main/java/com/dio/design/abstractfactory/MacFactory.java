package com.dio.design.abstractfactory;
public class MacFactory implements GUIFactory {
    public Button createButton() { return () -> System.out.println("Mac Button"); }
    public Window createWindow() { return () -> System.out.println("Mac Window"); }
}
