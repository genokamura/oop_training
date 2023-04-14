package oop_training;

import java.lang.StringBuilder;

public abstract class Car {
    protected String brand;
    protected int capacity;
    protected Money price;
    protected double acceleration;

    abstract void accelerate();
    abstract void brake();

    public String getBrand() {
        return brand;
    }
    public Money getPrice() {
        return price;
    }
    public int getCapacity() {
        return capacity;
    }
    public double getAcceleration() {
        return acceleration;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car information").append("\n");
        sb.append("brand\t\t:\t").append(brand).append("\n");
        sb.append("capacity\t:\t").append(capacity).append("名").append("\n");
        sb.append("price\t\t:\t").append(price).append("\n");
        sb.append("acceleration\t:\t").append(acceleration).append("m/s**2").append("\n");
        return sb.toString();
    }
}
