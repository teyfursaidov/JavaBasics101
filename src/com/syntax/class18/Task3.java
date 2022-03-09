package com.syntax.class18;

public class Task3 {
    private static String onlyvowels(String input) {
        //String newStr=input.replaceAll("[qwertASDFoplv]", "");
       // return newStr;
        return input.replaceAll("[aeiouAEIOU]", "");
    }
    public static void main(String[] args) {

        System.out.println(onlyvowels("Emilio"));

                //Create a method that will accept a String as a parameter and return a new
               // String that consist only of vowels. Method should be available inside the class only
                //where it was declared and executed by calling it is name.

    }
}
