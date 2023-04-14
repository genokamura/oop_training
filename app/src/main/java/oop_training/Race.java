package oop_training;

import java.util.List;
import java.util.ArrayList;
import java.lang.Thread;
import java.lang.InterruptedException;

public class Race {
    private int distance;
    private int elapsedTime = 0;

    private List<Car> cars = new ArrayList<>();
    private List<Car> goaledCars = new ArrayList<>();

    Race (List<Car> cars, int distance) {
        this.cars = cars;
        this.distance = distance;
    }

    public void game() {
        System.out.println("+++++Race started!+++++");
        System.out.println("Distance: " + this.distance + "m");

        while(true) {
            System.out.println("Elapsed time : " + this.elapsedTime + " sec");
            runCars();
            printCurrentStatus();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (isAllCarsGoaled()) {
                System.out.println("Game finished!");
                break;
            }
            elapsedTime++;
        }

        printRank();
    }

    private void runCars() {
        System.out.println("Cars run...");
        for (Car car : this.cars) {
            if (this.goaledCars.contains(car)) {
                continue;
            }
            // run when car is not goaled
            if (car.getCurrentDistance().intValue() <= this.distance) {
                car.run();
            }
            // add goaled car to goaledCars
            if (car.getCurrentDistance().intValue() >= this.distance) {
                this.goaledCars.add(car);
            }
        }
    }

    private void printCurrentStatus() {
        System.out.println("==========Current game==========");
        for (int i = 0; i < this.cars.size(); i++) {
            printCarState(this.cars.get(i));
        }
        System.out.println("================================");
    }

    private void printCarState(Car car) {
        System.out.println("Car: " + car.getBrand());
        if (car.getCurrentDistance().intValue() >= this.distance) {
            System.out.println("    Goaled!");
            return;
        }
        System.out.println("    speed: " + car.getCurrentSpeed() + "km/h");
        System.out.println("    distance: " + car.getCurrentDistance() + "m");
    }
    
    private void printRank() {
        System.out.println("============Ranking============");
        for (int i = 0; i < this.goaledCars.size(); i++) {
            System.out.println((i + 1) + " : " + this.goaledCars.get(i).getBrand());
        }
    }

    private boolean isAllCarsGoaled() {
        if (this.goaledCars.size() == cars.size()) {
            return true;
        }
        return false;
    }
}
