package com.syntax.class19;

public class Car {
    String make="Honda";
    String model;
    String color;
    String type;
    char fuel;
    Car(String make, String model, String color, String type, char fuel){
      /*If we have same local and instance variables, Java always prefer local variables if you want to
        instruct Java to use instance variables we use the "This" keyword.
       */
        this.make=make;
        this.model=model;
        this.color=color;
        this.type=type;
        this.fuel=fuel;


    }
    Car(){

    }
    void PrintCar(){
        String make="Toyota";
        System.out.println(make);
        System.out.println(this.make);
    }

}
