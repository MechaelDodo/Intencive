package ru.aston.odod_mu.task2;

import java.util.List;

public class ChangeFirstLastValue {
    static public <T> void change(List<T> arr){
        T k = arr.get(0);
        arr.set(0,arr.get(arr.size()-1));
        arr.set(arr.size()-1, k);
    }
}
