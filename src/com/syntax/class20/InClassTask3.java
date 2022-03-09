package com.syntax.class20;

    /*
    Write a Java program called Teacher.
    Identify features and behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and
    PianoTeacher that would have it their own features and behaviour. Test all 4 classes
     */

public class InClassTask3 {
    public static void main(String[] args) {
        MathTeacher math=new MathTeacher();
        math.name="George";
        math.teachAlgebra();

    }

}
    class Teacher101{
    String name;
    int age;
    double weight;
    void printName(){
        System.out.println(name);
    }

}
    class MathTeacher extends Teacher101{
        boolean trigonometry=true;
    void teachAlgebra(){
        System.out.println(name+" is teaching Algebra.");
    }
}
    class ChemistryTeacher extends Teacher101{
        boolean reading=false;
    void teachChemicals(){
        System.out.println(name+" is teaching chemicals.");
    }
}
    class PianoTeacher extends Teacher101{
        boolean singing=false;
    void teachingPiano(){
        System.out.println(name+" is teaching piano.");
    }
}