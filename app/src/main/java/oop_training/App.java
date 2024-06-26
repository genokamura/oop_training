/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package oop_training;

import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Cars in the race
        List<Car> cars = new ArrayList<>();

        List<CarFactory> carFactories = List.of(
                new HondaFactory(),
                new NissanFactory(),
                new FerrariFactory(),
                new ToyotaFactory()
        );

        // One car from each company will participate in the race
        for (CarFactory carFactory : carFactories) {
            Car car = carFactory.create();
            // Add 1 occupant to the car
            car.addOccupant();
            System.out.println(car);
            cars.add(car);
        }

        // Create race game
        Race race = new Race(cars, 10000);
        race.game();
    }
}
