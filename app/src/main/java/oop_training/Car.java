package oop_training;

import java.lang.StringBuilder;
import java.lang.UnsupportedOperationException;

public abstract class Car {
    protected String brand;
    protected int capacity;
    protected Money price;
    protected double acceleration;
    protected int vehicleHeight;
    protected boolean isLifted;
    protected final int LIFT_UP_HEIGHT = 40;
    protected final double ACCELERATION_DECREASE_RATE = 0.2;

    abstract void accelerate();
    abstract void brake();

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

    public int getVehicleHeight() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void liftUp() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void liftDown() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
