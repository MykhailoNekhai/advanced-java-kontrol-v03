package ua.uni;

import ua.uni.exceptions.ValidationException;

public class Order {
    private final int id;
    private final Customer customer;
    private final OrderItem[] items;

    public Order(int id, Customer customer, OrderItem[] items) {
        if (id < 0) {
            throw new ValidationException("Invalid order id");
        }
        if (customer == null) {
            throw new ValidationException("Customer is required");
        }
        if (items == null || items.length == 0) {
            throw new ValidationException("Order must contain items");
        }

        this.id = id;
        this.customer = customer;
        this.items = items.clone();
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public OrderItem[] getItems() {
        return items.clone();
    }

    public Money calculateTotal() {
        Money total = new Money(0);
        for (OrderItem item : items) {
            total = total.add(item.getTotalPrice());
        }
        return total;
    }
}