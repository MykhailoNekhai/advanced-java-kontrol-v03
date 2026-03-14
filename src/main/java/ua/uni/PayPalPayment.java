package ua.uni;

import ua.uni.exceptions.PaymentException;
import ua.uni.exceptions.ValidationException;

public class PayPalPayment implements PaymentMethod {
    private final Email paypalEmail;

    public PayPalPayment(Email paypalEmail) {
        if (paypalEmail == null) {
            throw new ValidationException("PayPal email is required");
        }
        this.paypalEmail = paypalEmail;
    }

    @Override
    public void pay(Order order, Money finalAmount) {
        if (order == null || finalAmount == null) {
            throw new PaymentException("Order and amount are required");
        }
        if (finalAmount.getAmount() < 300) {
            throw new PaymentException("PayPalPayment accepts amount from 300");
        }
        System.out.println("PayPal payment processed for order #" + order.getId() + ", email: " + paypalEmail);
    }



    @Override
    public String getName() {
        return "PAYPAL";
    }
}

