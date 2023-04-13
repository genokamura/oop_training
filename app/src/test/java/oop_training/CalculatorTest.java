package oop_training;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

class CalculatorTest {
    @Test
    void testCalcTotalPrice() {
        // Arrange
        Car honda = spy(new Honda());
        doReturn(new Money(1000000)).when(honda).getPrice();
        Car nissan = spy(new Nissan());
        doReturn(new Money(1000000)).when(nissan).getPrice();
        Car ferrari = spy(new Ferrari());
        doReturn(new Money(1000000)).when(ferrari).getPrice();
        List<Car> cars = List.of(honda, nissan, ferrari);
        Money expected = new Money(3000000);

        // Act
        Money totalPrice = CarPriceCalculator.calculateTotalPrice(cars);

        // Assert
        assertTrue(totalPrice.equals(expected));
    }

    @Test
    void testCalcAveragePrice() {
        // Arrange
        Car honda = spy(new Honda());
        doReturn(new Money(1000000)).when(honda).getPrice();
        Car nissan = spy(new Nissan());
        doReturn(new Money(1000000)).when(nissan).getPrice();
        Car ferrari = spy(new Ferrari());
        doReturn(new Money(1000000)).when(ferrari).getPrice();
        List<Car> cars = List.of(honda, nissan, ferrari);
        Money expected = new Money(1000000);

        // Act
        Money averagePrice = CarPriceCalculator.calculateAveragePrice(cars);

        // Assert
        assertTrue(averagePrice.equals(expected));
    }

}

