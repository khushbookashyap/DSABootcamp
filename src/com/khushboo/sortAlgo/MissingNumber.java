package com.khushboo.sortAlgo;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        //integer array of range [0,n]
        int [] arr ={6,4,5,3,1,0};
        System.out.println(missingNumber(arr));
    }

    private static int missingNumber(int[] arr) {
        int  i =0;
        while(i<arr.length){
            int correctIndex = arr[i]; //0 to n
            if(arr[i]<arr.length && arr[i]!= arr[correctIndex]){
                swap(arr,i, correctIndex);
            }else{
                i++;
            }
        }

        for(int index=0;index<arr.length;index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }


    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}

