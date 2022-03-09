package com.syntax.class19;
/*Write a java Class Students that have a constructor
    which takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade.
Test Student class for 5 different students with different marks.
Your program should print an average mark of each student's name.
 */

public class InClassTask2 {
    String name;
    double subject1;
    double subject2;
    double subject3;

    public InClassTask2(String name, double subject1, double subject2, double subject3) {
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    void printAvgGrade(){
        System.out.println("Student "+name+" has an average score of "+(subject1+subject2+subject3)/3);
    }

}
