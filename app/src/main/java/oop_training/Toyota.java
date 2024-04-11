package oop_training;

import java.math.BigDecimal;

public class Toyota extends Car {
    private final BigDecimal COEFFICIENT_OF_PRICE_AND_MAX_SPEED = new BigDecimal("0.00002");
    private final BigDecimal COEFFICIENT_OF_PRICE_AND_ACCELERATION = new BigDecimal("0.0000015");

    public Toyota() {
        brand = "Toyota";
        capacity = 4;
        price = new Money(RandomValueGenerator.generateRandomInt(1500000, 15000000));
        acceleration = new BigDecimal(this.getPrice().getAmount()).multiply(COEFFICIENT_OF_PRICE_AND_ACCELERATION);
        brakePerformance = new BigDecimal("3.0");
        maxSpeed = new BigDecimal(this.getPrice().getAmount()).multiply(COEFFICIENT_OF_PRICE_AND_MAX_SPEED).intValue();
        impactOfOccupantsAddition = this.acceleration.multiply(this.DETERIORATION_OF_ACCELERATION_PER_OCCUPANTS);
    }
}
