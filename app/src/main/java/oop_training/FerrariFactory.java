package oop_training;

public class FerrariFactory implements CarFactory {
    @Override
    public Car create() {
        return new Ferrari();
    }
}
