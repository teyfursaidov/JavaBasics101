package com.syntax.class18;

public class AccessModifiers {
    private String name="Tiran Got";
    int age=26; // default access
    protected double weight=213;
    public String color="green";


    public static void main(String[] args) {
        AccessModifiers aM=new AccessModifiers();
        System.out.println(aM.name);
        System.out.println(aM.age);
        System.out.println(aM.color);
        System.out.println(aM.weight);
    }
}
