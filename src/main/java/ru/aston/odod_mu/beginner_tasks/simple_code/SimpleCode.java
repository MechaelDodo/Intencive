package ru.aston.odod_mu.beginner_tasks.simple_code;

import java.util.*;

public class SimpleCode {

    static public String maxString(String s){
        String[] splitS = s.split(" ");
        String max_str = splitS[0];
        for(String str: splitS){
            if (max_str.length() <= str.length()){
                max_str = str;
            }
        }
        return max_str;
    }

    static public boolean polyndropString(String s){
        String str_test = new StringBuffer(s).reverse().toString();
        return s.equals(str_test);
    }

    static public String byakaString(String s){
        String[] splitS = s.split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        for(String str: splitS){
            if(str.equals("byaka")){
                str = "[virezano cenzuroi] ";
                stringBuffer.append(str);
            }else{
                stringBuffer.append((str+" ").intern());
            }
        }
        return stringBuffer.toString();
    }


    public static void main(String[] args){
//        String s1 = "hello";
//        String s2 = new String("hello");
//        //System.out.println(s1 == s2);
//
//        Animal a1 = new Animal(1, s1);
//        Animal a2 = new Animal(1, s2);
//        System.out.println(a1.equals(a2));
//
//
//        HashSet<Animal> animals= new HashSet<>();
//        animals.add(a1);
//        animals.add(a2);
//        System.out.println(animals.size());
//        System.out.println(Objects.hash(61,"asd",23,5,"qwee"));
//        System.out.println(Objects.hash(1,"asd",23,5,"qwee"));
//
//        HashSet<String> strings= new HashSet<String>();
//        strings.add("sad");
//        strings.add("sad1");
//        String s = new String("sad");
//        strings.add(s);
//        System.out.println(strings);
//        System.out.println("sad".equals(s));
//
//        s = "qweiojwqe iwqej dqwepojwqdijodqwjiopd kls pq s sad";
//        System.out.println(SimpleCode.maxString(s));
//        System.out.println(SimpleCode.polyndropString("dede"));
//        s = "adasddsa byaka diwquhqwbyaka byaka wdqw qwebyaka byaka";
//        System.out.println(SimpleCode.byakaString(s));
//        System.out.println(s.indexOf("byaka", 10));
//
//        Animal dog = new Dog(18,"ZHak");
//
//        AnimalDoing.animalSays(dog);
//        AnimalDoing.jumping(dog);

        List<String> arr = new ArrayList<>(Arrays.asList("asdsda", "sadasd", "dog", "sdas"));
        //arr.add("haha");
        for(String i: arr){
            if(i.equals("dog")){
                arr.remove(i);
            }
        }
        System.out.println(arr);

    }





}
