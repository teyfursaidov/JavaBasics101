package com.syntax.class17;

public class Students {
    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students student1= new Students();
        student1.name="Vladimir";
        student1.id="323";
        Students.numberOfStudents++;

        Students student2= new Students();
        student2.name="Admiral";
        student2.id="574";
        Students.numberOfStudents++;

        Students student3= new Students();
        student3.name="Vahtang";
        student3.id="633";
        Students.numberOfStudents++;
        System.out.println(Students.numberOfStudents);


    }
}
