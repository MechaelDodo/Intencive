package ru.aston.odod_mu.task1;

import java.math.BigDecimal;

public class Passenger extends Car{

    public Passenger(String price, String name){
        this.price = new BigDecimal(price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Passenger car: " + this.name + ", Price: " + this.price.toString();
    }

    @Override
    public void getInfo(){
        System.out.println("This is passenger car");
    }





}

