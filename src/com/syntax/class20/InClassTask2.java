package com.syntax.class20;

    /*
    Write program to inherit class A that has method
        printF which is static and call or reuse that method into class B
     */

public class InClassTask2 {
    public static void main(String[] args) {
        BB.printF();
    }
}
    class AA {
        static void printF(){
            System.out.println("Batch 12 tester class.");
        }
}
    class BB extends AA{

}
