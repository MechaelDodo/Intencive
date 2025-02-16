package ru.aston.odod_mu.task2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueNum {
    static public Integer find(List<Integer> arr){
        Map<Integer, Integer> counter = new HashMap<>();
        for(Integer i: arr){
            counter.put(i, counter.getOrDefault(i, 0) + 1);//добавляем 1 когда встречается первый раз
        }
        for(Integer i: arr){
            if(counter.get(i) == 1){
                return i;
            }
        }
        return 0;
    }
}
