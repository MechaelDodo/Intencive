package main.java.ru.aston.odod_mu.task1;

class Passenger extends Car{

    public Passenger(int price, String name){
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Passenger car: " + this.name + ", Price: " + this.price;
    }

    @Override
    public void getInfo(){
        System.out.println("This is passenger car");
    }



}

