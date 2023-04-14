package oop_training;

public abstract class SuperCar extends Car {
    protected int vehicleHeight;
    protected boolean isLifted;
    protected final int LIFT_UP_HEIGHT = 40;
    protected final double ACCELERATION_DECREASE_RATE = 0.2;

    public abstract void liftUp();
    public abstract void liftDown();
    public abstract int getVehicleHeight();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("vehicle height\t:\t").append(vehicleHeight).append("mm").append("\n");
        return sb.toString();
    }
}

