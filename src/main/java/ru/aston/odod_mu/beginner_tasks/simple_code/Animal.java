package ru.aston.odod_mu.beginner_tasks.simple_code;

import java.util.Objects;

public class Animal {
    private int age;
    private String name;

    public Animal(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object a){
        if(this == a) return true;
        else if(a == null || a.getClass() != getClass()) return false;
        return (this.age == ((Animal) a).age && this.name.equals(((Animal) a).name));
    }

    @Override
    public int hashCode(){
        int h = Objects.hash(age, name);
        System.out.println(h);
        return h;
        //return super.hashCode();
    }

    public void say(){
        System.out.println("Animal says");
    }
}
