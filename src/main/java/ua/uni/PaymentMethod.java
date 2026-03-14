package ua.uni;

public interface PaymentMethod {
    void pay(Order order, Money finalAmount);

    String getName();
}