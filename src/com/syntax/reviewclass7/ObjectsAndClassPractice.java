package com.syntax.reviewclass7;

public class ObjectsAndClassPractice {

        String empName="Tolik";
        int empID=1212;
        String group;
    void employeeDetails(){
        System.out.println("This method shows the details of the employee.");
    }
    void employeeGroup(){
        System.out.println("This method shows the group of the employee.");
    }

    public static void main(String[] args) {
        ObjectsAndClassPractice obj=new ObjectsAndClassPractice();
        obj.employeeGroup();
        obj.employeeDetails();

    }
}
