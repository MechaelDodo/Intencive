package ru.aston.odod_mu.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CheckSortedList {
    private static List<Integer> mySort(List<Integer> arr){
        for(int i = 0; i <= arr.size()-1; i++){
            for(int j = 0; j < arr.size()-i-1; j++){
                if(arr.get(j) > arr.get(j+1)){
                    Integer k = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, k);
                }
            }
        }
        return arr;
    }

    public static boolean checkSort(List<Integer> arr){
        List<Integer> copy = new ArrayList<>(arr);
        return arr.equals(mySort(copy));
    }
}
