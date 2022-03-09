package com.syntax.class18;

public class AccessModifiersTester {
    public static void main(String[] args) {
        AccessModifiers aM=new AccessModifiers();
       // System.out.println(aM.name); //unable to access due to name being private
        System.out.println(aM.age);
        System.out.println(aM.color);
        System.out.println(aM.weight);
    }
}
