package ru.aston.odod_mu.task1;


import java.util.Objects;

public class User{
    private int age;
    private String name;
    private String sourName;

    public User(int age, String name, String sourName){
        this.age = age;
        this.name = name;
        this.sourName = sourName;
    }

    public String getSourName(){
        return this.sourName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(sourName, user.sourName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, sourName);
    }

    @Override
    public String toString(){
        return "User: " + this.name + " " + this.sourName;
    }
}
