package oop_training;

public class Honda extends Car {
    public Honda() {
        brand = "Honda";
        capacity = 6;
        price = new Money(3000000);
        acceleration = 8;
    }

    @Override
    void accelerate() {
        System.out.println("Honda is Accelerating...");
    }

    @Override
    void brake() {
        System.out.println("Honda is Braking...");
    }
}
