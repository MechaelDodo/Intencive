package main.java.ru.aston.odod_mu.task1;

abstract class Car implements Comparable<Car>{

    int price;
    String name;

    protected int getPrice(){
        return this.price;
    }
    /*
    @Override
    protected Car clone(){
        try {
            return (Car) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }
     */
    abstract void getInfo();

    @Override
    public int compareTo(Car car){
        return Integer.compare(this.price, car.price);
    }
}