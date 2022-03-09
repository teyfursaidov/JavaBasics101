package com.syntax.class17;

public class Review02 {
    public static void main(String[] args) {
        //How would you check if String is palindrome or not
        // Example1: aba --> true aba
        // Example2: Abbc --> false cbbA
        Review02 review=new Review02();
        System.out.println(review.isPalindrome("aba"));
        System.out.println(review.isPalindrome("Abbc"));

    }

    boolean isPalindrome(String inputString) {
        String reverseCode = reversedString(inputString); // reversing a word
        return reverseCode.equals(inputString); // checking if words are same
    }

    String reversedString(String inputString) {
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}