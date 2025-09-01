package com.dio.design.builder;
public class Person {
    private final String name;
    private final Integer age;
    private final String city;

    private Person(Builder b) {
        this.name = b.name; this.age = b.age; this.city = b.city;
    }

    public static class Builder {
        private final String name;
        private Integer age;
        private String city;
        public Builder(String name) { this.name = name; }
        public Builder age(int a) { this.age = a; return this; }
        public Builder city(String c) { this.city = c; return this; }
        public Person build() { return new Person(this); }
    }

    @Override public String toString() { return "Person[name="+name+",age="+age+",city="+city+"]"; }
}
