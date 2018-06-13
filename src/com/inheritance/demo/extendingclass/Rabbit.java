package com.inheritance.demo.extendingclass;

public class Rabbit extends Animal {
    public Rabbit(int age) {
        super(); // Does not compile
        super.setAge(10); // Does not compile
    }
}
