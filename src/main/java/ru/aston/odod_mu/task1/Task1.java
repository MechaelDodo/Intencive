package main.java.ru.aston.odod_mu.task1;

import java.util.ArrayList;
import java.util.List;

/*
P.S. немного измененное ТЗ
пока делал задание думал о "Продаже" авто, в итоге после того как доделал, увидел в описании слово "Аренда".....
 */
public class Task1 {
    public static void main(String[] args){

        User user1 = new User(26, "Misha", "Odod");
        User user2 = new User(21, "Dasha", "Kley");
        User user3 = new User(30, "Andrey", "Popov");

        Car truck1 = new Truck(20000, "Metal");
        Car truck2 = new Truck(30000, "Gold");
        Car truck3= new Truck(4000, "Bad Truck");

        Car passenger1 = new Passenger(10000, "BMW");
        Car passenger2 = new Passenger(12000, "Lada");
        Car passenger3= new Passenger(40000, "Super car");

        Order order1 = new Order(user1);
        Order order2 = new Order(user2);
        Order order3 = new Order(user3);

        order1.setOrders(truck1);
        order1.setOrders(passenger3);
        order1.setOrders(passenger1);
        order1.setOrders(passenger3);
        order1.setOrders(truck2);
        order1.setOrders(passenger3);
        order1.setOrders(passenger3);

        order1.printOrder();
        System.out.println(order1.priceCalc());
        System.out.println(order1.getDiscount());


        order2.setOrders(truck2);
        order2.setOrders(passenger3);
        order2.setOrders(passenger1);
        order2.setOrders(passenger1);
        order2.setOrders(truck3);

        order3.setOrders(truck1);
        order3.setOrders(passenger2);
        order3.setOrders(passenger1);
        order3.setOrders(passenger3);
        order3.setOrders(truck2);
        order3.setOrders(truck1);
        order3.setOrders(truck3);

        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        Order.printAllOrders(orders);

    }
}





