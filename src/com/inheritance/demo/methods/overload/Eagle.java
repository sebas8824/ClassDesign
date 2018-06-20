package com.inheritance.demo.methods.overload;

public class Eagle extends Bird {
    public int fly(int height) {
        System.out.println("Eagle is flying at " + height + " meters");
        return height;
    }

    public void eat(int food) {
        System.out.println("Eagle is eating " + food + " units of food");
    }
}
