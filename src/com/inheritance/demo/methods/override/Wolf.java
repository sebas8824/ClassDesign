package com.inheritance.demo.methods.override;

public class Wolf extends Canine {
    public double getAverageWeight() {
        return getAverageWeight()+20;
    }

    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
    }
}


