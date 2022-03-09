package com.syntax.reviewclass7;

public class SimplePractice3 {
    String studentName;
    String course;
    int studentID;
    int grades;

    void displayStudentRecord(){
        System.out.println("The student name is: "+studentName+" and the course student enrolled for is "+course);
        System.out.println("The student ID is: "+studentID+" and the grades student achieved are "+grades);

    }

    public static void main(String[] args) {

        //creating the first object of class to assign first set of values
        SimplePractice3 p3= new SimplePractice3();
        p3.studentName="Ragu";
        p3.course="SDET";
        p3.studentID=1212;
        p3.grades=64;
        p3.displayStudentRecord();

        System.out.println("========================");

        //creating a second object of class to assign second set of values
        SimplePractice3 p31=new SimplePractice3();
        p31.studentName="Origami";
        p31.course="Paper Bending";
        p31.studentID=3232;
        p31.grades=78;
        p31.displayStudentRecord();

    }
}
