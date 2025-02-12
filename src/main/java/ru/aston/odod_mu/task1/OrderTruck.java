package ru.aston.odod_mu.task1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

interface OrderTruck extends OrderConfigure{
    //Добавление машины в заказ
    void setCar(Truck car);
    BigDecimal priceCalcTruck();
    BigDecimal getDiscountTruck();
}
