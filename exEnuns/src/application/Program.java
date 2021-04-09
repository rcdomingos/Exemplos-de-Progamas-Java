package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(1070,new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus or1 = OrderStatus.DELIVERED;
        OrderStatus or2= OrderStatus.valueOf("DELIVERED");

        System.out.println(or1);
        System.out.println(or2);
    }
}
