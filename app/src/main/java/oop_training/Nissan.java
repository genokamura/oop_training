package oop_training;

public class Nissan extends Car {
    public Nissan() {
        brand = "Nissan";
        capacity = 5;
        price = new Money(1500000);
        acceleration = 8;
    }

    @Override
    void accelerate() {
        System.out.println("Nissan is Accelerating...");
    }

    @Override
    void brake() {
        System.out.println("Nissan is Braking...");
    }
}
