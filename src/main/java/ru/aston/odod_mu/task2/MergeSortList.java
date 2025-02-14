package ru.aston.odod_mu.task2;

//int[] arr = {2,1,6,4,9,0,11,55,23,15};

import java.util.ArrayList;
import java.util.List;

public class MergeSortList {

    public static void mergeSort(List<Integer> arr){
        if(arr.size() <= 1) return;
        int mid = arr.size()/2;
        List<Integer> left_arr = new ArrayList<>(mid);
        List<Integer> right_arr = new ArrayList<>(arr.size() - mid);

        for(int i = 0; i < mid; i++){
            left_arr.add(i, arr.get(i));
        }

        for(int i = mid; i < arr.size(); i++){
            right_arr.add(i-mid, arr.get(i));
        }

        mergeSort(left_arr);
        mergeSort(right_arr);
        merge(arr, left_arr, right_arr);
        //System.out.println("Good by");
    }

    public static void merge(List<Integer> arr, List<Integer> left_arr, List<Integer> right_arr){
        int i =0, j = 0, k = 0;
        while(i < left_arr.size() && j < right_arr.size()){
            if (left_arr.get(i) <= right_arr.get(j)){
                arr.set(k++, left_arr.get(i++));
            } else{
                arr.set(k++, right_arr.get(j++));
            }
        }
        while (i < left_arr.size()){
            arr.set(k++, left_arr.get(i++));
        }
        while (j < right_arr.size()){
            arr.set(k++, right_arr.get(j++));
        }
    }
}
