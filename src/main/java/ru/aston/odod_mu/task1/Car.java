package ru.aston.odod_mu.task1;

import java.math.BigDecimal;

abstract public class Car implements Comparable<Car>, Cloneable{

    BigDecimal price;
    String name;


    protected BigDecimal getPrice(){
        return this.price;
    }

    @Override
    protected Car clone(){
        try {
            return (Car) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }

    abstract void getInfo();

    @Override
    public int compareTo(Car car){
        return Double.compare(this.price.doubleValue(), car.price.doubleValue());
    }
}