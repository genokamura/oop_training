package oop_training;

public class HondaFactory implements CarFactory {
    @Override
    public Car create() {
        return new Honda();
    }
}
