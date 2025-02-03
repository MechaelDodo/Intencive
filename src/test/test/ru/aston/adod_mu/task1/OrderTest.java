package ru.aston.adod_mu.task1;

import org.junit.Test;
import ru.aston.odod_mu.task1.Car;
import ru.aston.odod_mu.task1.Order;
import ru.aston.odod_mu.task1.Passenger;
import ru.aston.odod_mu.task1.Truck;
import ru.aston.odod_mu.task1.User;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class OrderTest {
    private Order order = new Order(new User(18, "Den", "Denovich"));

    private enum Cars{
        CAR_PASSENGER(new Passenger(1800, "Lada")),
        CAR_TRUCK(new Truck(20000, "BELAZ"));

        private Car car;
        private Cars(Car car){
            this.car = car;
        }
        public Car getCar(){
            return car;
        }
    }

    {
        this.order.setOrders(Cars.CAR_PASSENGER.getCar());
        this.order.setOrders(Cars.CAR_TRUCK.getCar());
        this.order.setOrders(Cars.CAR_TRUCK.getCar());
        this.order.setOrders(Cars.CAR_TRUCK.getCar());
    }

    @Test
    public void getDiscountTest(){
        /*
        В корзине 4 машины - 1 легковая, 3 грузовых
        Расчет скидки идет по логике:
        - Если в корзине больше или равно 5 легковых машин,
        то сумма цен легковых машин умножается на 0.7;
        - Если в корзине больше или равно 3 грузовых машин,
        то сумма цен легковых машин умножается на 0.8;

        Т.е должно получиться 1800 + ((20000+20000+20000)*0.8) = 49800
         */
        assertEquals(49800, this.order.getDiscount());
    }

}
