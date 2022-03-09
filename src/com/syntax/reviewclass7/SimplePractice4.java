package com.syntax.reviewclass7;

public class SimplePractice4 {

    void verifyBatch12IsGoodEnough(boolean isGood){
        if(isGood){
            System.out.println("I guess they pass.");
        }else {
            System.out.println("Close but not good enough.");
        }
    }

    public static void main(String[] args) {
        SimplePractice4 p=new SimplePractice4();
        p.verifyBatch12IsGoodEnough(true);

    }

}
