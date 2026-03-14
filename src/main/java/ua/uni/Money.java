package ua.uni;

import ua.uni.exceptions.ValidationException;

import java.util.Objects;

public class Money {
    private final double amount;

    public Money(double amount) {
        if (amount < 0) {
            throw new ValidationException("Amount cannot be negative");
        }
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    public Money multiply(int quantity) {
        if (quantity <= 0) {
            throw new ValidationException("Quantity must be positive");
        }
        return new Money(this.amount * quantity);
    }

    public Money add(Money other) {
        if (other == null) {
            throw new ValidationException("Money cannot be null");
        }
        return new Money(this.amount + other.amount);
    }


    public Money percentage(double percent) {
        if (percent < 0) {
            throw new ValidationException("Percent cannot be negative");
        }
        return new Money(this.amount * percent / 100.0);
    }

    @Override
    public String toString() {
        return "Money{amount=" + amount + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money money)) return false;
        return Double.compare(money.amount, amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}