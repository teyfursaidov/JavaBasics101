package com.syntax.class21;

public class MethodOverloadDemo2 {
    void printInfo(String name, int age, double weight){
        System.out.println("Example 1");
        System.out.println(name+" is "+age+" of age and weighs "+weight+" pounds.");
    }
    void printInfo(int age, String name, double weight){
        System.out.println("Example 2");
        System.out.println(name+" is "+age+" of age and weighs "+weight+" pounds.");
    }
    void printInfo(double weight, int age, String name){
        System.out.println("Example 3");
        System.out.println(name+" is "+age+" of age and weighs "+weight+" pounds.");
    }
    void printInfo(int age, double weight, String name){
        System.out.println("Example 4");
        System.out.println(name+" is "+age+" of age and weighs "+weight+" pounds.");
    }
    // output will depend on your input order age, name, weight.
    public static void main(String[] args) {
        MethodOverloadDemo2 methodOverloadDemo2=new MethodOverloadDemo2();
        methodOverloadDemo2.printInfo("John", 23, 123);
        methodOverloadDemo2.printInfo(23, "John", 123.5);
        methodOverloadDemo2.printInfo(123.5, 21, "John");
        methodOverloadDemo2.printInfo(21, 232.1, "Henry");
    }
}
