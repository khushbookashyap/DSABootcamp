package com.khushboo.sortAlgo;

import java.util.Arrays;

public class CyclicSort {
    //used when we are given question which have range of numbers 1 to n or 0 to n

    public static void main(String[] args) {
        //integer arr of range [1,n]
        int [] arr ={6,4,2,5,3,1};
        System.out.println(Arrays.toString(cyclicSort(arr)));

    }

    public static int[] cyclicSort(int [] arr){
        int i =0;
        while(i<arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i, correctIndex);
            }else{
                i++;
            }
        }
       return arr;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
