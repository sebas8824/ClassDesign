package com.inheritance.demo.interfaces.deafult;

public interface Walk {
    public default int getSpeed() {
        return 5;
    }
}
