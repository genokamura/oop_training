package oop_training;

import java.lang.StringBuilder;
import java.lang.UnsupportedOperationException;
import java.lang.IllegalStateException;
import java.math.BigDecimal;

public abstract class Car {
    protected String brand;
    protected int capacity;
    protected Money price;
    protected BigDecimal acceleration;
    protected BigDecimal brakePerformance;
    protected int vehicleHeight;
    protected boolean isLifted;
    protected int maxSpeed;
    protected BigDecimal currentSpeed = new BigDecimal("0");
    protected BigDecimal currentDistance = new BigDecimal("0");
    protected int occupants = 0;
    protected BigDecimal impactOfOccupantsAddition;
    protected final int LIFT_UP_HEIGHT = 40;
    protected final BigDecimal ACCELERATION_DECREASE_RATE = new BigDecimal("0.2");
    protected final BigDecimal DETERIORATION_OF_ACCELERATION_PER_OCCUPANTS = new BigDecimal("0.05");

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car information").append("\n");
        sb.append("brand\t\t:\t").append(this.getBrand()).append("\n");
        sb.append("capacity\t:\t").append(this.getCapacity()).append("名").append("\n");
        sb.append("price\t\t:\t").append(this.getPrice()).append("\n");
        sb.append("max speed\t:\t").append(this.getMaxSpeed()).append("km/h").append("\n");
        sb.append("acceleration\t:\t").append(this.getAcceleration()).append("m/s**2").append("\n");
        sb.append("occupants\t:\t").append(this.getOccupants()).append("名").append("\n");
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
    public BigDecimal getAcceleration() {
        return acceleration.setScale(1, BigDecimal.ROUND_HALF_UP);
    }
    public BigDecimal getBrakePerformance() {
        return brakePerformance.setScale(1, BigDecimal.ROUND_HALF_UP);
    }
    public int getOccupants() {
        return occupants;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public BigDecimal getCurrentSpeed() {
        return currentSpeed.setScale(1, BigDecimal.ROUND_HALF_UP);
    }
    public BigDecimal getCurrentDistance() {
        return currentDistance.setScale(1, BigDecimal.ROUND_HALF_UP);
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

    public void addOccupant() {
        if (occupants < capacity) {
            occupants++;
            acceleration = acceleration.subtract(impactOfOccupantsAddition);
        } else {
            throw new IllegalStateException("The car is full.");
        }
    }

    public void removeOccupant() {
        if (occupants > 0) {
            occupants--;
            acceleration = acceleration.add(impactOfOccupantsAddition);
        } else {
            throw new IllegalStateException("The car is empty.");
        }
    }

    void accelerate() {
        System.out.println(this.getBrand() + " is Accelerating...");
        this.currentSpeed = this.currentSpeed.add(this.getAcceleration());
        // never go above the max speed
        if (this.currentSpeed.intValue() > this.maxSpeed) {
            this.currentSpeed = new BigDecimal(this.maxSpeed);
        }
    }

    void brake() {
        System.out.println(this.getBrand() + " is Braking...");
        this.currentSpeed = this.currentSpeed.subtract(this.getBrakePerformance());
        // never go below 0km/h
        if (this.currentSpeed.compareTo(new BigDecimal("0")) == -1) {
            this.currentSpeed = new BigDecimal("0");
        }
    }

    public void run() {
        // accelerate when the car is stopped
        if (currentSpeed.compareTo(new BigDecimal("0")) == 0) {
            accelerate();
        } else if (currentSpeed.intValue() == maxSpeed) {
            // brake when the car reaches the max speed
            brake();
        } else {
            // 1/4 chance to brake 
            if (RandomValueGenerator.generateRandomInt(1, 4) == 1) {
                brake();
            } else {
                accelerate();
            }
        }

        this.currentDistance = this.getCurrentDistance().add(new BigDecimal(currentSpeed.intValue()));
    }
}
