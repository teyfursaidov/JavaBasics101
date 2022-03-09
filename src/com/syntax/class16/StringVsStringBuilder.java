package com.syntax.class16;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        String s=new String("Asghar Is Great"); // original string
        s.concat("hahaha"); // adding new String to the string
        //System.out.println(s.replace(" ", ""));
        System.out.println(s); // printing out the original string

        StringBuilder stringBuilder=new StringBuilder("Asghar Is Great"); // original string from line 5
        stringBuilder.append("HaHaHa"); // adding new String hahaha to the string from line 6
        //System.out.println(stringBuilder.append("HaHa")); // concat is like append.
        System.out.println(stringBuilder); // printing out the original string from line 8

    }
}
