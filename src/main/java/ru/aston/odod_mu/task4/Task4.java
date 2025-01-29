package main.java.ru.aston.odod_mu.task4;

public class Task4 {
    public static void main(String[] args){
        Car car1 = new Car("green","peugeot", 2000);
        Car car2 = new Car("black","bmw", 2500);
        for(Car car: new Car[]{car1, car2}){
            car.printInfo();
        }
    }
}

class Car{
    private String color;
    private String name;
    private int weight;

    public Car(){ }

    public Car(String color, String name, int weight){
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    public Car(String color){
        this.color = color;
    }

    public Car(String color,  int weight){
        this.color = color;
        this.weight = weight;
    }

    public void printInfo(){
        System.out.println("color: " + this.color +  " weight: " + this.weight + " name: " +  this.name);
    }

}