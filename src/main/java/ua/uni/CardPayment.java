package ua.uni;

import ua.uni.exceptions.PaymentException;

public class CardPayment implements PaymentMethod {
    private final String cardNumber;

    public CardPayment(String cardNumber) {
        if (cardNumber == null || cardNumber.isBlank()) {
            throw new PaymentException("Invalid card number");
        }
        this.cardNumber = cardNumber;
    }


    @Override
    public void pay(Order order, Money finalAmount) {

    }

    @Override
    public String getName() {


    }
}