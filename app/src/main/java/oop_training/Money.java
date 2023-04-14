package oop_training;

import java.text.NumberFormat;
import java.util.Locale;

class Money {
    private final int amount;
    private static final NumberFormat CURRENCY_FORMAT = NumberFormat.getCurrencyInstance(Locale.JAPAN);

    public Money(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return CURRENCY_FORMAT.format(amount);
    }

    private int compareTo(Money other) {
        return Integer.compare(amount, other.amount);
    }

    public boolean largerThan(Money other) {
        return compareTo(other) > 0;
    }

    public boolean smallerThan(Money other) {
        return compareTo(other) < 0;
    }

    public boolean equals(Money other) {
        return compareTo(other) == 0;
    }

}

