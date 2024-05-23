package com.khushboo.sortAlgo;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicateNumbers {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,7,2,3,1};
        printList(allMissingNumbers(arr));
    }

    private static List<Integer> allMissingNumbers(int[] arr) {
        int i =0;
        while(i<arr.length){
            int correctIndex = arr[i] -1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i, correctIndex);
            }
            else{
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int j =0;j<arr.length;j++){
            if(arr[j] != j+1){
                list.add(arr[j]);
            }
        }
        return list;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }

    static void printList(List<Integer> list){
        for(int i : list){
            System.out.println(i);
        }
    }
}
