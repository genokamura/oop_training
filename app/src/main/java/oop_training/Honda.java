package oop_training;

import java.math.BigDecimal;

public class Honda extends Car {
    public Honda() {
        brand = "Honda";
        capacity = 6;
        price = new Money(RandomValueGenerator.generateRandomInt(2000000, 3000000));
        acceleration = new BigDecimal("8");
        brakePerformance = new BigDecimal("2.0");
        maxSpeed = 180;
        impactOfOccupantsAddition = this.acceleration.multiply(this.DETERIORATION_OF_ACCELERATION_PER_OCCUPANTS);
    }
}
