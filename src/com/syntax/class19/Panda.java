package com.syntax.class19;

public class Panda {
    String name="Poonda";
    String breed="Black Poonda";
    String color="Yellow";
    int age=4;
    double weight=234;
    double height=7.4;

    Panda(String pandaName, String pandaBreed, String pandaColor, double pandaHeight,
          int pandaAge, double pandaWeight){
        name=pandaName;
        breed=pandaBreed;
        color=pandaColor;
        age=pandaAge;
        weight=pandaWeight;
        height=pandaHeight;
    }
    Panda(String pandaName){
        name=pandaName;
    }
    Panda(String pandaName, String pandaBreed){
        name=pandaName;
        breed=pandaBreed;
    }
    Panda(int pandaAge, double pandaWeight){
        age=pandaAge;
        weight=pandaWeight;
    }



    void printInfo(){
        System.out.println("Panda name is "+name+" and it is "+breed+" breed with color "
                +color+" and he is "+age+" years old weighing "+weight+" with a height of "+height);
    }

}
