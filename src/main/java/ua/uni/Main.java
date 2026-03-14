package ua.uni;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OrderItem iphone = new OrderItem(123, "Iphone", new Money(1400));
        OrderItem macbook = new OrderItem(3333, "AIR15", new Money(2400));

        new Order(1,new Customer("Misha","m@ukr.net"),new OrderItem[]{iphone,macbook});
    }
}