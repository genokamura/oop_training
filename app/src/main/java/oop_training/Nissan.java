package oop_training;

import java.math.BigDecimal;

public class Nissan extends Car {
    private BigDecimal DEFECT_COEFFICIENT = new BigDecimal("0.6");

    public Nissan() {
        brand = "Nissan";
        capacity = 5;
        price = new Money(RandomValueGenerator.generateRandomInt(1500000, 1999999));
        acceleration = new BigDecimal("8");
        brakePerformance = new BigDecimal("2.0");
        maxSpeed = 180;
        impactOfOccupantsAddition = this.acceleration.multiply(this.DETERIORATION_OF_ACCELERATION_PER_OCCUPANTS);
    }

    @Override
    public BigDecimal getAcceleration() {
        return acceleration.multiply(DEFECT_COEFFICIENT);
    }
}
