package oop_training;

public class Ferrari extends Car {
    public Ferrari() {
        brand = "Ferrari";
        capacity = 2;
        price = new Money(50000000);
        acceleration = 20;
    }

    @Override
    void accelerate() {
        System.out.println("Ferrari is Accelerating...");
    }

    @Override
    void brake() {
        System.out.println("Ferrari is Braking...");
    }
}
