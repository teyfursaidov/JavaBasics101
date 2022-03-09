package com.syntax.class16;

import java.util.Arrays;

public class InClassTask2 {
    public static void main(String[] args) {


        StringBuilder str=new StringBuilder("I Need To Reverse This Sentence");
        System.out.println(str.reverse());

        String s="Sunday";
            StringBuilder str1=new StringBuilder(s);
            str1.reverse();
            s=str1.toString();
        System.out.println(s);

        String newString="";
        String s2=str.toString();
        String[] strArr=s2.split(" ");
        System.out.println(Arrays.toString(strArr));
       // for (int i=strArr.length-1; i>=0; i--) {
            //newStr+=strArr[i]+" ";
       // }
       // System.out.println(newStr);

        /*String phrase="This is sentence i want to reverse";
        String[] words=phrase.split(" ");
         for(int i=0; i<=phrase.length()-1; i++){
            for(int j=words[i].length()-1; j>=0; j--){
                System.out.print(words[i].charAt(j));

            }
            System.out.print(" ");
        }
            */

























    }
}
