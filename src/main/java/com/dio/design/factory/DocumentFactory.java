package com.dio.design.factory;
public class DocumentFactory {
    public static Printable create(String type) {
        return switch(type.toLowerCase()) {
            case "pdf" -> new PdfDocument();
            case "txt" -> new TextDocument();
            default -> throw new IllegalArgumentException("Unknown: " + type);
        };
    }
}
