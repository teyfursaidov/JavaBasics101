package com.syntax.class19;

public class Horse101 {

    // It is a very good practice to make the fields private
    private String name;
    private int age;
    private double weight;

  /*No argument or zero argument constructor
    Horse101(){
        // inside no argument constructor you can
            //write some important lines of code that
                //you want to execute when the object
                    //of a class is created.
        //Example: When you want to fetch some info from internet or from your
            hard disk to give initialize values to the fields.
    }

   */

    // purpose of sconstructor is to give initial values to the fields of a class
    Horse101(String horseName,int horseAge,double horseWeight) {
        name=horseName;
        age=horseAge;
        weight=horseWeight;
    }

    // Constructors do not have return types like int, String not even void
        //void Horse101(String...,int...,double){
            //name
            //age
            //weight


    void printHorseName(){

        System.out.println("Name "+name);
    }

    void setName(String horseName){
        name=horseName;
    }
}
