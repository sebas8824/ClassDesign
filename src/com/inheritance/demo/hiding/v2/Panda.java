package com.inheritance.demo.hiding.v2;

public class Panda extends Bear {
    public static void sneeze() {
        System.out.println("Panda bear sneezes quietly");
    }

    public void hibernate() {
        System.out.println("Panda bear is going to sleep");
    }
}
