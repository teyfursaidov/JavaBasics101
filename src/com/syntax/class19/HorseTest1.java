package com.syntax.class19;

public class HorseTest1 {
    public static void main(String[] args) {

        Horse101 horse = new Horse101("Jockey", 20, 342);
        //horse.setName("Jockey");

        /*
        Horse101 -> Data type (Names of classes)
        horse -> Object/instance/reference variable/variable
        Equal to (=) sign -> assignment operator
        Horse101(...,...,...) -> call to a constructor
        Semi column (;) -> line terminator
         */
        horse.printHorseName();

    }
}
