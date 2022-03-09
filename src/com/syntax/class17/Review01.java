package com.syntax.class17;

public class Review01 {
    public static void main(String[] args) {
        //get the words from the syntax
        //reverse the words
        //append the words to get the sentence back
        String s = "Sunday is the last day.";
        Review01 review=new Review01();
        //System.out.println(review.reverseString(s));
        String[] strArray=s.split(" ");
        //System.out.println(strArray[0]);
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(review.reverseString(strArray[i])+" ");

        }
       // String[] strArray = s.split("");
       // for (int i = 0; i < strArray.length; i++) {
        //    System.out.print(strArray[i]);
        }


        String reverseString(String inputString) {
        // converting S string to StringBuilder so that we can use the reverse method
            StringBuilder stringBuilder=new StringBuilder(inputString);
            stringBuilder.reverse();
            return stringBuilder.toString();



    }
}
