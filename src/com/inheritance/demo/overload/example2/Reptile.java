package com.inheritance.demo.overload.example2;

public class Reptile {
    protected boolean hasLegs() throws InsufficientDataException {
        throw new InsufficientDataException();
    }
    protected double getWeight() throws Exception {
        return 2;
    }
}
