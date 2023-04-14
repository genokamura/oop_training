package oop_training;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {
    @Test
    void testLargerThan() {
        // Arrange
        Money money1 = new Money(1000000);
        Money money2 = new Money(2000000);

        // Act
        boolean result = money1.largerThan(money2);

        // Assert
        assertFalse(result);
    }

    @Test
    void testSmallerThan() {
        // Arrange
        Money money1 = new Money(1000000);
        Money money2 = new Money(2000000);

        // Act
        boolean result = money1.smallerThan(money2);

        // Assert
        assertTrue(result);
    }
}
