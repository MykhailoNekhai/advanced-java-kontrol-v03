package ua.uni;

import ua.uni.exceptions.ValidationException;

import java.util.Objects;

public class OrderItem {
    private final int id;
    private final String name;
    private final int quantity;
    private final Money price;

    public OrderItem(int id, String name, Money price) {
        this(id, name, 1, price);
    }

    public OrderItem(int id, String name, int quantity, Money price) {
        if (id < 0) {
            throw new ValidationException("Invalid item id");
        }
        if (name == null || name.isBlank()) {
            throw new ValidationException("Invalid item name");
        }
        if (quantity <= 0) {
            throw new ValidationException("Quantity must be greater than 0");
        }
        if (price == null) {
            throw new ValidationException("Price is required");
        }

        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Money getTotalPrice() {
        return price.multiply(quantity);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Money getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItem orderItem)) return false;
        return id == orderItem.id &&
                quantity == orderItem.quantity &&
                Objects.equals(name, orderItem.name) &&
                Objects.equals(price, orderItem.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, quantity, price);
    }
}