package oop_training;

public class ToyotaFactory implements CarFactory {
    @Override
    public Car create() {
        return new Toyota();
    }
}
