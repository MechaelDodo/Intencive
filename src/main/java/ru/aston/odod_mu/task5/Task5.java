package main.java.ru.aston.odod_mu.task5;

import java.time.LocalDate;
import java.time.Period;

public class Task5 {
    public static void main(String[] args){
        House house1 = new House();
        House house2 = new House();
        house1.set_params(9, LocalDate.of(2000, 1, 29), "House1");
        house2.set_params(12, LocalDate.of(2020, 5, 30), "House2");
        for(House house: new House[]{house1, house2}){
            house.print_params();
            System.out.println("Age:" + house.getAge() + "\n");
        }

    }
}

class House{
    private int countFloor;
    private LocalDate date;
    private String name;

    public void set_params(int countFloor, LocalDate date, String name){
        this.countFloor = countFloor;
        this.date = date;
        this.name = name;
    }

    public void print_params(){
        System.out.println("Floors:" + this.countFloor);
        System.out.println("Date:" + this.date);
        System.out.println("Name:" + this.name);
    }

    public int getAge(){
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(this.date, currentDate);
        return period.getYears();
    }
}