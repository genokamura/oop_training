package oop_training;

public class Ferrari extends SuperCar {
    public Ferrari() {
        brand = "Ferrari";
        capacity = 2;
        price = new Money(50000000);
        acceleration = 20;
        vehicleHeight = 100;
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
            acceleration *= (1 - ACCELERATION_DECREASE_RATE);
            System.out.println("Ferrari is lifted up");
        }
    }

    @Override
    public void liftDown() {
        if (isLifted) {
            isLifted = false;
            this.vehicleHeight -= LIFT_UP_HEIGHT;
            acceleration /= (1 - ACCELERATION_DECREASE_RATE);
            System.out.println("Ferrari is lifted down");
        } else {
            System.out.println("Ferrari is already lifted down");
        }
    }

    @Override
    public int getVehicleHeight() {
        return vehicleHeight;
    }
}
