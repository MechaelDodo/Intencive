package main.java.ru.aston.odod_mu.task6;


import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Task6 {
    public static void main(String[] args){
        Tree tree1 = new Tree(50, "tree1");
        Tree tree2 = new Tree(100, "tree2", true);
        Tree tree3 = new Tree();
    }
}

class Tree{
    private int age;
    private boolean alive;
    private String name;

    public Tree(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Tree(int age, String name, boolean alive){
        this.age = age;
        this.name = name;
    }

    public Tree(){
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8)));
        writer.println("Пустой конструктор без параметров сработал");
        writer.flush();
    }

}