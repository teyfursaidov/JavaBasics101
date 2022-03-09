package com.syntax.class20;

public class HumanTester {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="Jack";
        System.out.println(student.name);
        student.printName();
        student.studentID="3423";
        System.out.println("=========================");

        Principle principle=new Principle();
        principle.name="Johny";
        principle.printName();
        principle.specialParking=false; // no output
    }
}
