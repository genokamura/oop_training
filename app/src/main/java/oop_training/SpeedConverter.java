package oop_training;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SpeedConverter {
    private static final BigDecimal METER_PER_SECOND_TO_KILOMETER_PER_HOUR = new BigDecimal("3.6");

    public static BigDecimal convertKilometerPerHourToMeterPerSecond(BigDecimal kilometerPerHour) {
        return kilometerPerHour.divide(METER_PER_SECOND_TO_KILOMETER_PER_HOUR, 1, RoundingMode.HALF_UP);
    }
}
