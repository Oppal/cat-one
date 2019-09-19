package com.ics.demo.oop;

public class Mammals extends Animal implements AnimalInterface{
    private int numberOfLegs;
    private int gestationPeriod;

    public Mammals(String name, TypeOfEye typeOfEye, int numberOfLegs, int gestationPeriod) {
        super(name, typeOfEye);
        this.gestationPeriod = gestationPeriod;
        this.numberOfLegs = numberOfLegs;
    }

    public Mammals(String name, TypeOfEye typeOfEye, int gestationPeriod) {
        super(name, typeOfEye);
        this.gestationPeriod = gestationPeriod;

    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getGestationPeriod() {
        return gestationPeriod;
    }

    public void setGestationPeriod(int gestationPeriod) {
        this.gestationPeriod = gestationPeriod;
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "numberOfLegs=" + numberOfLegs +
                ", gestationPeriod=" + gestationPeriod +
                ", name='" + name + '\'' +
                ", typeOfEye=" + typeOfEye +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Mammals walk...");
    }
}
