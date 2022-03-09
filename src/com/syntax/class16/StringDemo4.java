package com.syntax.class16;

import java.util.Arrays;

public class StringDemo4 {
    public static void main(String[] args) {
        String str="This is a sentence";
        String[] strArr=str.split(" ");
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr.length);
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[3]);
        String str2="This is a sentence. Batch 12 is great."+"Edward is not great. He is super great.";
        String[] strArr2=str2.split("[.]");
        System.out.println(strArr2.length);
        System.out.println(strArr2[3].trim()); // trim removes all spaces












    }
}
