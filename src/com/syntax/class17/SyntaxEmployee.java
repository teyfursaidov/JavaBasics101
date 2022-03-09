package com.syntax.class17;

public class SyntaxEmployee {
    //Create 3 variables empID, salary and set CEO
    String empID;
    double salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee aselClassObject=new SyntaxEmployee();
        aselClassObject.empID="123";
        aselClassObject.salary=23456;
        System.out.println(aselClassObject.empID);
        System.out.println(aselClassObject.salary);
        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee mozzamObject=new SyntaxEmployee();
        mozzamObject.empID="456";
        mozzamObject.salary=4331;
        System.out.println(mozzamObject.empID);
        System.out.println(mozzamObject.salary);
        System.out.println(SyntaxEmployee.CEO);
    }
}
