package ru.aston.odod_mu.task1;

public class Truck extends Car{

    public Truck(int price, String name){
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Truck car: " + this.name + ", Price: " + this.price;
    }

    @Override
    public void getInfo(){
        System.out.println("This is truck car");
    }


}



