package com.syntax.class17;

public class HealthyDog {
    //when the information is expected to be different from object to object
    // we store that information in an instance variable
    String name; // instance
    String color; // instance
    // if we know that a value will stay same for all the objects of a class
    // we create a static variable for that. because
    static int numberOfLegs=4; //static
    void eat(){
        int noOfTimes=3; //local
        System.out.println(name+" eats "+noOfTimes+" times a day.");
    }

    void sleep() {
        //System.out.println(name+" sleeping"); can access local variables in other methods
    }

    public static void main(String[] args) {
        HealthyDog dog=new HealthyDog(); //local
        dog.name="bark";
        dog.color="purple";
        HealthyDog.numberOfLegs=4;
        dog.eat();

        HealthyDog dog2=new HealthyDog();
        dog2.name="scooby";
        dog2.color="red";
        HealthyDog.numberOfLegs=4;
        dog2.eat();
    }
}
