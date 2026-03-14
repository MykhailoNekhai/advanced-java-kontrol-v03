package ua.uni;

public class CashPayment implements PaymentMethod {


    @Override
    public void pay(Order order, Money finalAmount) {

    }

    @Override
    public String getName() {
        return "";
    }
}
