package com.inheritance.demo.interfaces.inheritance;

public class LeopardSeal implements HasTail, HasWhiskers {
    public int getTailLength() {
        return 4;
    }

    public int getNumberOfWhiskers() {
        return 6;
    }
}
