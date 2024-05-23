package com.khushboo.sortAlgo;

import java.util.Arrays;

public class SortingAlg {

    public static void main(String[] args) {
         int [] arr = {-3,5,7,2,-76,10,56};
        System.out.println(Arrays.toString(bubble(arr)));
        System.out.println(Arrays.toString(selection(arr)));
        System.out.println(Arrays.toString(insertion(arr)));
    }

    public static int[] swap(int[] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        return arr;
    }

    public static int maxIndex(int[] arr,int start, int end){
        int max = start;
        for(int i=0;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    public static int[] insertion(int[] arr ){
        for(int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j-1,j);
                }
            }
        }
        return arr;
    }

    public static int[] selection(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            int last = arr.length-i-1;
            int max = maxIndex(arr,0,last);
            swap(arr, max, last);
        }
        return arr;
    }

    public static int[] bubble(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length-1;i++){
             swapped = false;
            for(int j =1;j<arr.length-i-1;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j-1,j);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
              }
        }
        return arr;
    }
}
