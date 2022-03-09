package com.syntax.class17;

import com.syntax.class18.AccessModifiers;

public class AccessModifierTest {
    public static void main(String[] args) {
        AccessModifiers aM=new AccessModifiers();
        //System.out.println(aM.name);
        //System.out.println(aM.age);
        System.out.println(aM.color);
       // System.out.println(aM.weight);

        /*
        Can`t access name because it has private access
        Can`t access age because it has default access
        Can`t access weight because it has protected access
            can only access color because it has public
                access which can be accessed from anywhere inside the same project
         */
    }
}
