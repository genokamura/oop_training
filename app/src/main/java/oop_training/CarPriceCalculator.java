package oop_training;

import java.util.List;

public class CarPriceCalculator {
    public static Money calculateTotalPrice(List<Car> cars) {
        int totalPrice = 0;
        for (Car car : cars) {
            totalPrice += car.getPrice().getAmount();
        }
        return new Money(totalPrice);
    }

    public static Money calculateAveragePrice(List<Car> cars) {
        int totalPrice = calculateTotalPrice(cars).getAmount();
        int averagePrice = totalPrice / cars.size();
        return new Money(averagePrice);
    }
}
