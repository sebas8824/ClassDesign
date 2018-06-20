package com.inheritance.demo.hiding.v1;

public class Panda extends Bear {
    public static void eat() {
        System.out.println("Panda bear is chewing.");
    }
    public static void main(String[] args) {
        Panda.eat();
    }
}
