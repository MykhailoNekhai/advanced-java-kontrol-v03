package ua.uni;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardPaymentTest {
    @Test
    void shouldProcessCardPaymentWhenAmountIsValid() {
        Order order = new Order(1,null,new OrderItem[]{new OrderItem(1,"Iphone",new Money(222))});
        CardPayment payment = new CardPayment("1111222233334444");

        assertDoesNotThrow(() -> payment.pay(order, order.calculateTotal()));
    }

}