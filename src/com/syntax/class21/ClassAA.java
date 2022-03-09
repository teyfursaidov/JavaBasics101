package com.syntax.class21;

public class ClassAA {
    String name;
    int age;
    double weight;

    public ClassAA(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void printInfo(){
        System.out.println(name+" is "+age+" years old and weighs "+weight+" pounds");
    }
}
class ClassBB extends ClassAA{

    public ClassBB(String name, int age, double weight) {
        super(name, age, weight); // mostly used type of 'super' keyword in real life
        /*
        Because the constructors from the parent class don't participate in inheritance
            we need to create a matching constructor in the child classes as well
            using super with () to call the constructor from the parent class, so we do not have to repeat the code
         */
    }
}
class Test{
    public static void main(String[] args) {
        ClassBB classBB = new ClassBB("John Doe", 21, 123);
        classBB.printInfo();
    }
}
