package com.syntax.class21;

public class MethodOverloadDemo1 {
    static void add(int num1, int num2){
        System.out.println("Output 1");
        System.out.println(num1+num2);
    }

    static void add(double num1, double num2){
        System.out.println("Output 2");
        System.out.println(num1+num2);
    }

    static void add(String num1, String num2){
        System.out.println("Output 3");
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {
        add(12,34);
        add(12.3,32.4);
        add("12", "21");

    }
}
