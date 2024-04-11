package oop_training;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpeedConverterTest {
    @Test
    void testConvertKilometerPerHourToMeterPerSecond() {
        // Arrange
        BigDecimal kilometerPerHour = new BigDecimal("108.0");
        BigDecimal expectedMeterPerSecond = new BigDecimal("30.0");

        // Act
        BigDecimal actualMeterPerSecond = SpeedConverter.convertKilometerPerHourToMeterPerSecond(kilometerPerHour);

        // Assert
        assertEquals(expectedMeterPerSecond, actualMeterPerSecond);
    }

    @Test
    void testConvertKilometerPerHourToMeterPerSecondScale() {
        // Arrange
        BigDecimal kilometerPerHour = new BigDecimal("100.0");
        BigDecimal expectedMeterPerSecond = new BigDecimal("27.8");

        // Act
        BigDecimal actualMeterPerSecond = SpeedConverter.convertKilometerPerHourToMeterPerSecond(kilometerPerHour);

        // Assert
        assertEquals(expectedMeterPerSecond, actualMeterPerSecond);
    }
}
