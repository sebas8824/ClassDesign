package com.inheritance.demo.interfaces.deafult;

public interface Run {
    public default int getSpeed() {
        return 10;
    }
}
