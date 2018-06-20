package com.inheritance.demo.methods.hiding.comparison;

public class Marsupial {
    public static boolean isBiped() {
        return false;
    }
    public void getMarsupialDescription() {
        System.out.println("Marsupial waks on two legs: " + isBiped());
    }
}
