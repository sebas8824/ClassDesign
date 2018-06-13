package com.inheritance.demo.overload.example2;

public class Snake extends Reptile {
    protected boolean hasLegs() {
        return false;
    }
    protected double getWeight() throws InsufficientDataException {
        return 2;
    }
}
