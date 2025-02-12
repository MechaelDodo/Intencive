package ru.aston.odod_mu.task1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

interface OrderPassenger extends OrderConfigure{
    //Добавление машины в заказ
    void setCar(Passenger car);
    BigDecimal priceCalcPassenger();
    BigDecimal getDiscountPassenger();
}
