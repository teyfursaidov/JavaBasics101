package com.syntax.reviewclass7;

public class SimplePractice5 {
    String weekDay(String day){
        switch(day){
            case"monday":
                return "It is lazy day";
            case"tuesday":
                return "It is productive day";
            case"wednesday":
                return "Is is gloomy day";
            case"thursday":
                return "It is exciting day";
            case"friday":
                return "No school day";
            case"saturday":
                return "Oh well it is the weekend";
            default:
                return "No correct option found";
        }
    }

    public static void main(String[] args) {
        SimplePractice5 p=new SimplePractice5();
        String goutput= p.weekDay("saturday");
        System.out.println(goutput);

    }
}
