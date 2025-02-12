package ru.aston.odod_mu.task1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Order implements Discount, OrderTruck, OrderPassenger{
    private final User user;
    private static final Comparator<Order> userComparator = Comparator.comparing(o -> o.user.getSourName());
    private final List<Truck> order_truck;
    private final List<Passenger> order_passenger;

    public Order(User user){
        this.user = user;
        this.order_truck = new ArrayList<>();
        this.order_passenger = new ArrayList<>();
    }

    //Цена всех добавленных машин
    @Override
    public BigDecimal priceCalc(){
        return priceCalcPassenger().add(priceCalcTruck());
    }


    //Добавление машины в заказ
    public void setOrders(Car car) {
        if(car instanceof Passenger){
            this.setCar((Passenger) car.clone());
        }else if(car instanceof Truck){
            this.setCar((Truck) car.clone());
        }
    }

    //Расчет скидки
    @Override
    public BigDecimal getDiscount(){
        return (getDiscountTruck().add(getDiscountPassenger()));
    }

    //Выводим отсортированную по прайсу корзину определенного юзера
    public void printOrder(){
        System.out.println("Order by");
        System.out.println(this.user);
        List<Car> combinedOrder = Stream.concat(this.order_passenger.stream(), this.order_truck.stream())
                .sorted()
                .collect(Collectors.toList());
        combinedOrder.forEach(System.out::println);
        System.out.println("\n");
    }

    //Выводим отсортированную корзину по фамилии пользователей
    public static void printAllOrders(List<Order> orders) {
        orders.stream()  // Создаем поток из списка заказов
                .sorted(Order.userComparator)  // Сортируем по компаратору пользователей
                .forEach(order -> order.printOrder());  // Для каждого заказа вызываем метод printOrder()
    }

    //Добавление машины в заказ
    public void setCar(Truck car){
        order_truck.add(car);
    }

    public void setCar(Passenger car){
        order_passenger.add(car);
    }

    public BigDecimal priceCalcTruck() {
        return this.order_truck.stream()  // Создаем поток из списка order_truck
                .map(Truck::getPrice)  // Преобразуем каждый объект Truck в его цену
                .reduce(BigDecimal.ZERO, BigDecimal::add);  // Суммируем все цены
    }

    public BigDecimal priceCalcPassenger(){
        return this.order_passenger.stream()  // Создаем поток из списка order_truck
                .map(Passenger::getPrice)  // Преобразуем каждый объект Truck в его цену
                .reduce(BigDecimal.ZERO, BigDecimal::add);  // Суммируем все цены
    }

    public BigDecimal getDiscountTruck(){
        if (order_truck.size() >= 3){        //логика для расчета скидки грузовых автомобилей
            return this.priceCalcTruck().multiply(DISCOUNT_PERCENT.DISCOUNT_TRUCK.get_percent());
        }else{
            return this.priceCalcTruck();
        }
    }

    public BigDecimal getDiscountPassenger(){
        if (order_passenger.size() >= 5){        //логика для расчета скидки грузовых автомобилей
            return this.priceCalcPassenger().multiply(DISCOUNT_PERCENT.DISCOUNT_PASSENGER.get_percent());
        }else{
            return this.priceCalcPassenger();
        }
    }

}
