package com.dio.design.template;
public class CSVDataProcessor extends DataProcessor {
    protected String[] parse(String input) {
        return input.split("\\n"); 
    }
    protected void save(String[] data) { System.out.println("Saved " + data.length + " rows to DB (simulated)"); }
}
