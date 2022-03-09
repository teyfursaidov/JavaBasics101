package com.syntax.class16;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringDemo3 {
    public static void main(String[] args) {
        String str="1234567890-=!@#$%^&*()_+QWERTY";
        System.out.println(str.replaceAll("[0-5]", "~")); // square brackets lets you put a range of numbers you want to remove or replace
        System.out.println(str.replaceAll("[^A-Za-z0-9]", ""));
        System.out.println(str.replaceAll("[!-/]",""));





















    }
}
