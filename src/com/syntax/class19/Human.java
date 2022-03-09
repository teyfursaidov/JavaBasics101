package com.syntax.class19;

public class Human {
    String name;
    int age;
    double weight;
    char gender;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("123");
        System.out.println("456");

    }
    public Human(String name, int age, double weight) {
        this(name, age);
        this.weight=weight;
        System.out.println("Will show weight");

    }
    public Human(String name, int age, double weight, char gender) {
        this(name, age, weight);
        this.gender = gender;
        System.out.println("Will show gender");
    }
}
