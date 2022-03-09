package com.syntax.class16;

import java.util.Arrays;

public class InClassTask1 {
    public static void main(String[] args) {

        //Task 1
        String s = "There is a brighter future.";
        String newS = s.replace(" ", "");
        System.out.println(newS);

        //Task2
        String s2 = "@#$%1234qwerASDF";
        System.out.println(s2.length());
        System.out.println(s2.replaceAll("[^A-Za-z0-9]", "").length()); // method chaining calling multiple methods on same line.

        //Task3
        String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(a.length()); // String class method to count the number of characters in a class
        System.out.println(a.split("[?]").length); // length property that we can use to check the number of elements in an array
        String split = a.replace("?", "!");
        System.out.println(split);
        String day = a.replace("today", "tomorrow");
        System.out.println(day);

    }
        String[] method ( int[] numbers){
            String[] stringArr = new String[numbers.length];
            return stringArr;
        }


    }

