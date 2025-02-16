package ru.aston.odod_mu.task2;

import java.util.*;

public class Task2 {
    public static void main(String[] args){
       List<Integer> list = new ArrayList <>(Arrays.asList(2,1,6,4,9,0,11,55,23,15));
//        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        System.out.println(CheckSortedList.checkSort(list2));
//        ChangeFirstLastValue.change(list2);
//        System.out.println(list2);
//        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,1,3,4,4,5,7));
//        System.out.println(UniqueNum.find(list3));

//        int[] arr = {2,1,6,4,9,0,11,55,23,15};
//        //MergeSortList.mergeSort(arr);
//        /*MergeSortList.mergeSort(arr, 0, arr.length-1);*/
//        for(int i: arr){
//            System.out.println(i);
//        }
        MergeSortList.mergeSort(list);
        System.out.println(list);

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("first", 1);
        map1.put("third", 3);
        map1.put(null, 3);
        map1.put(null, null);


    }
}
