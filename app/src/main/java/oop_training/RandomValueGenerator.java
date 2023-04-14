package oop_training;

public class RandomValueGenerator {
    public static int generateRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
