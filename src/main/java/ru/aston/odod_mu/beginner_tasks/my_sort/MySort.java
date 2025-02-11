package ru.aston.odod_mu.beginner_tasks.my_sort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MySort {
    public static void main(String[] args){
        int[] arr = {1,7,3,2,6,9,0};
        System.out.println("{1,7,3,2,6,9,0}");
        /*for(int i:MySort.insertionSort(arr)){
            System.out.println(i);
        }*/
        //MySort.mergeSort(arr, 0, arr.length-1);
        int result = MySort.binarySearch(arr, 6, 0, arr.length - 1);
        List<Integer> arr2 = new ArrayList<>();
        for(int a: arr){
            arr2.add(a);
        }
        Iterator<Integer> iterator = arr2.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

    private static int[] bubbleSort(int[] arr){
        for(int i = 0; i< arr.length-1; i++){

            for(int j = 0; j<arr.length-1-i; j++){
                //System.out.println("i:"+ i + ", j:"+ j + ", arr[j]:" + arr[j] +", arr[j+1]:" + arr[j+1]);
                if(arr[j]>arr[j+1]){
                    int k = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = k;
                }
            }
        }
        return arr;
    }
    private static int[] selectionSort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){

            for(int j = i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
            }
        }
        return arr;
    }
    private static int[] insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            for(int j = i - 1; j >= 0; j--){
                if(arr[j]>arr[j+1]){
                    int k = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = k;
                }
            }
        }
        return arr;
    }
    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {

            int mid = left + (right - left) / 2;
            mergeSort(array, left, mid); // Сортируем левую половину
            mergeSort(array, mid + 1, right); // Сортируем правую половину
            MySort.merge(array, left, mid, right); // Объединяем две половины
        }
    }
    private static void merge(int[] array, int left, int mid, int right) {
        //System.out.println(" left "+left+" right "+right + " mid "+mid);
        for(int i:array){
            System.out.println(i);
        }
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Копируем данные во временные массивы
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        // Объединяем временные массивы обратно в array
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        // Добавляем оставшиеся элементы
        while (i < n1) {
            array[k++] = leftArray[i++];
        }
        while (j < n2) {
            array[k++] = rightArray[j++];
        }
    }

    private static int binarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1; // Базовый случай: элемент не найден
        }

        int mid = left + (right - left) / 2; // Вычисляем середину

        if (array[mid] == target) {
            return mid; // Элемент найден
        } else if (array[mid] < target) {
            return binarySearch(array, target, mid + 1, right); // Ищем в правой половине
        } else {
            return binarySearch(array, target, left, mid - 1); // Ищем в левой половине
        }
    }

}
