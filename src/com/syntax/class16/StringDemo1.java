package com.syntax.class16;

public class StringDemo1 {
    public static void main(String[] args) {
        String str="MonkeyMonkey BB #5128847964 ABC";
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.length());
        System.out.println(str.charAt(str.length()-1));
        System.out.println("*****************************************");

        System.out.println(str.indexOf('b')); // will get -1 due to not finding a lower case 'b'
        System.out.println(str.indexOf('n'));
        System.out.println(str.lastIndexOf('e')); // will print furthest char
        System.out.println(str.substring(3));
        System.out.println(str.substring(str.indexOf("#")+1, str.indexOf("#")+1+11));














    }
}
