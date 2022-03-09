package com.syntax.class20;

public class Lion extends Animal{

    boolean hunt=true;
    void roar(){
        System.out.println(name+" is roaring"+color);
    }

    public static void main(String[] args) {
        Lion lion=new Lion();
        lion.name="Leon";
        lion.color="coffee";
        lion.sleep();
        lion.roar();
    }
}
