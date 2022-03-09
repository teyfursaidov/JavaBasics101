package com.syntax.class19;

import com.syntax.class20.ParentClass;

public class ChildClass extends ParentClass {
    void printInfo(){
        //System.out.println(name); set to private
       // System.out.println(age); defaults not accessible in other packages
        System.out.println(weight);
        System.out.println(color);
    }

}
