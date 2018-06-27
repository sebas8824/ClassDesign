package com.inheritance.demo.interfaces.staticmethod;

public class Bunny implements Hop {
    public void printDetails() {
        System.out.println(Hop.getJumpHeight());
    }
}
