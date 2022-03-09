package com.syntax.class20;

public class ParentClass {
    private String name; // do not participate in inheritance
    int age;
    protected double weight;
    public String color;
}
class Child extends ParentClass{
    void printInfo(){
        //System.out.println(name); set to private
        System.out.println(age);
        System.out.println(weight);
        System.out.println(color);
    }
}