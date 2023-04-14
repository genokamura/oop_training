package oop_training;

import java.math.BigDecimal;

public class Ferrari extends Car {
    public Ferrari() {
        brand = "Ferrari";
        capacity = 2;
        price = new Money(RandomValueGenerator.generateRandomInt(10000000, 50000000));
        acceleration = new BigDecimal("20");
        vehicleHeight = 100;
        impactOfOccupantsAddition = this.acceleration.multiply(this.DETERIORATION_OF_ACCELERATION_PER_OCCUPANTS);
    }

    @Override
    void accelerate() {
        System.out.println("Ferrari is Accelerating...");
    }

    @Override
    void brake() {
        System.out.println("Ferrari is Braking...");
    }

    @Override
    public void liftUp() {
        if (isLifted) {
            System.out.println("Ferrari is already lifted up");
        } else {
            isLifted = true;
            this.vehicleHeight += LIFT_UP_HEIGHT;
            acceleration = acceleration.multiply(new BigDecimal("1").subtract(ACCELERATION_DECREASE_RATE));
            System.out.println("Ferrari is lifted up");
        }
    }

    @Override
    public void liftDown() {
        if (isLifted) {
            isLifted = false;
            this.vehicleHeight -= LIFT_UP_HEIGHT;
            acceleration = acceleration.divide(new BigDecimal("1").subtract(ACCELERATION_DECREASE_RATE));
            System.out.println("Ferrari is lifted down");
        } else {
            System.out.println("Ferrari is already lifted down");
        }
    }

    @Override
    public int getVehicleHeight() {
        return vehicleHeight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("vehicle height\t:\t").append(this.getVehicleHeight()).append("mm").append("\n");
        return sb.toString();
    }
}
