package main.java.ru.aston.odod_mu.task3;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Task3 {
    public static void main(String[] args){
        //у меня почему-то кодировка летит, хотя в логах пишет UTF-8, поэтому использую PrintWriter
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8)));
        Study study = new Study("Изучение Java - это просто!");
        writer.println(study.printCourse());
        writer.flush();
        //System.out.println(study.printCourse());
    }
}


class Study {

    private String course;

    public Study(String course){
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }
}


