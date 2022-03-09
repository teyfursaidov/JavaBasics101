package com.syntax.class20;

public class FrogTester {
    public static void main(String[] args) {

        Frog frog=new Frog("Forkie", "yellow", 12, 32);
        frog.printInfo();
        new Frog("Troop", "red", 3).printInfo();
    }
}
