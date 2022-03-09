package com.syntax.class18;

public class Task2 {
    // Create a method that will take a String
    // as a parameter and returns reversed String.
    // method should be available to all classes within your project.
    // your project it should be accessible by class name also

    public static String reverseString(String input){
       // StringBuilder stringBuilder=new StringBuilder(input);
        //stringBuilder.reverse();
        //return stringBuilder.toString();
        return new StringBuilder(input).reverse().toString(); //
        //new StringBuilder(input) object creation
        //new StringBuilder(input).reverse() calling a method on that object
       // new StringBuilder(input).reverse().toString() calling two methods on that object

    }

    public static void main(String[] args) {
        String name="Emilio";
        System.out.println(Task2.reverseString(name));
    }
}
