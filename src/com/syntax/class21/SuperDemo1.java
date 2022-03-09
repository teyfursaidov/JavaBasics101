package com.syntax.class21;

public class SuperDemo1 {
}
class AAA{
    AAA(){

    }
}
class BBB{
    String name;

    BBB(){

    }
    BBB(String name){
        super();
        //this(); not able to use this() and super() inside same constructor
        this.name=name;
    }

}