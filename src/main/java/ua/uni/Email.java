package ua.uni;

import ua.uni.exceptions.ValidationException;

import java.util.Objects;

public class Email {
    private final String value;

    public Email(String value) {
        if (value == null || value.isBlank() || !value.contains("@")) {
            throw new ValidationException("Invalid email");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Email email)) return false;
        return Objects.equals(value, email.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}