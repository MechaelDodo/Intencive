package ru.aston.odod_mu.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Order implements Discount{
    private User user;
    private List<Car> orders;
    private static final double DISCOUNT_TRUCK = 0.8;
    private static final double DISCOUNT_PASSENGER = 0.7;
    private static Comparator<Order> userComparator = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            return o1.user.getSourName().compareTo(o2.user.getSourName());
        }
    };

    public Order(User user){
        this.user = user;
        this.orders = new ArrayList<>();
    }

    //Цена всех добавленных машин
    @Override
    public int priceCalc(){
        int price = 0;
        for(Car order: this.orders){
            price += order.getPrice();
        }
        return price;
    }

    //Цена определенных машин (для метода getDiscount)
    private int priceCalc(List<Car> cars){
        int price = 0;
        for(Car order: cars){
            price += order.getPrice();
        }
        return price;
    }

    //Добавление машины в заказ
    public void setOrders(Car car) {
        this.orders.add(car);
    }   //в идеале делать клон

    //Расчет скидки
    @Override
    public int getDiscount(){
        List<Car> trucks = new ArrayList<>();
        List<Car> passengers = new ArrayList<>();
        for(Car car: this.orders){
            if (car instanceof Truck){
                trucks.add(car);
            }else if (car instanceof Passenger){
                passengers.add(car);
            }
        }
        int price_trucks = this.priceCalc(trucks);
        int price_passengers = this.priceCalc(passengers);
        if (trucks.size() >= 3){        //логика для расчета скидки грузовых автомобилей
            price_trucks = (int) (price_trucks*DISCOUNT_TRUCK);
        }
        if (passengers.size() >= 5){    //логика для расчета скидки легковых автомобилей
            price_passengers = (int) (price_passengers*DISCOUNT_PASSENGER);
        }
        return (price_trucks + price_passengers);
    }

    //Выводим отсортированную по прайсу корзину определенного юзера
    public void printOrder(){
        System.out.println("Order by");
        System.out.println(this.user);
        this.orders.sort(null);
        for(Car car: this.orders){
            System.out.println(car);
        }
        System.out.println("------------");
    }

    //Выводим отсортированную корзину по фамилии пользователей
    public static void printAllOrders(List<Order> orders){
        orders.sort(Order.userComparator);
        for(Order order: orders){
            order.printOrder();
        }
    }



}
