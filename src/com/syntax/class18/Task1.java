package com.syntax.class18;

public class Task1 {
    // Create a method that will accept an array as parameters
    // and will return a sum of all elements from that array.
    // Method should be vible only within same package and
    //accessible by creating an instance of the class.
    int sumAray(int[] array) {
        int sum=0;
        for(int num:array){
            sum+=num;
        }
        return sum;
    }
}
