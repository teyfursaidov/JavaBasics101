package com.syntax.class19;

public class Day {
    boolean sunny;
    boolean weekday;
    double temp;
    Day(boolean sunny, boolean weekday, double hour){

    }
    Day(){

    }
    void PrintDay(){
        boolean sunny=false;
        boolean weekday=true;
        double temp=28;
        if(sunny==true) {
            System.out.println("It is sunny outside.");
        }else {
            System.out.println("Gloomy day.");
        }
        if(temp>=32) {
            System.out.println("It is a great weather.");
        }else {
            System.out.println("Much rather sit at home.");
        }
        if(weekday==true) {
            System.out.println("It is weekday.");
        }else {
            System.out.println("It is a weekend.");
        }
        }
}
