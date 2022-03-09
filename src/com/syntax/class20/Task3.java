package com.syntax.class20;
    /*
        Write a Java class that have 4 constructors with 4 different access
        levels of constructors(private, public, default, protected) and create
        4 objects of this class: 1 inside same class; 2 from outside the class;
        3 from different class inside different package and observe result.
    */
public class Task3 {
    private Task3(int a){
        System.out.println("Private");
    }
    Task3(double a){
        System.out.println("Default01");
    }
    protected Task3(String a){
        System.out.println("Protected");
    }
    public Task3(boolean a){
        System.out.println("Public");
    }

        public static void main(String[] args) {
        new Task3(10);
        new Task3("TEST");
        new Task3(true);
        new Task3(2.24);
        }

}
