package com.syntax.class21;

public class Parent1 {
    String name="Parent";
    void printName(){
        System.out.println(name);
    }
}
class Child1 extends Parent1{
    String name="Child";
    void printName(){
        String name="Teyfuring"; // first priority is given to local variables
        System.out.println(name);
        // when 'this' keyword used Java will only pull value from instance variable
        //even if we have a local variable
        System.out.println(this.name);
        // when 'super' keyword is used Java will only pull value from parent class instance variable
        // even if we have a local and instance variables inside same class
        System.out.println(super.name);
    }
}
class ParentTester{
    public static void main(String[] args) {
        Child1 child1=new Child1();
        child1.printName();
    }
}