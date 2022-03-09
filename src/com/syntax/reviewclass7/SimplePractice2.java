package com.syntax.reviewclass7;

public class SimplePractice2 {
    // writing method in the class to return record
    String getRecord(){
        String department="QA";
        String empName="Fiolet";
        String details="Work Force"+empName+" belongs to "+department;
        return details;



    }

    public static void main(String[] args) {
        // creating an object of class
        SimplePractice2 p=new SimplePractice2();
        p.getRecord();
    }

}
