package ru.aston.odod_mu.beginner_tasks.simple_code;

public class AnimalDoing {

    static public void animalSays(Animal animal){
        animal.say();
    }


    static public void jumping(Animal animal){
        System.out.println("Animal jumps");
    }

    static public void jumping(Dog dog){
        System.out.println("Dog jumps");
    }
}
