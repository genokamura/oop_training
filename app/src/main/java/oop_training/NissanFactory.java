package oop_training;

public class NissanFactory implements CarFactory {
    @Override
    public Car create() {
        return new Nissan();
    }
}
