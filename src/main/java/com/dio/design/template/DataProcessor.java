package com.dio.design.template;
public abstract class DataProcessor {
    public final void process(String input) {
        var parsed = parse(input);
        validate(parsed);
        save(parsed);
    }
    protected abstract String[] parse(String input);
    protected void validate(String[] data) { System.out.println("Validating " + data.length + " records"); }
    protected abstract void save(String[] data);
}
