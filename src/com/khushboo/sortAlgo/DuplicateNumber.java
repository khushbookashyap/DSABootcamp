package com.khushboo.sortAlgo;

public class DuplicateNumber {
    public static void main(String[] args) {
        int [] arr = {4,3,5,3,8,2,6,1};
        System.out.println(duplicateNumber(arr));
    }

    private static int duplicateNumber(int[] arr) {
        int i =0;
        while(i<arr.length){
            int correctIndex = arr[i] -1;
            if(arr[i]!= arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }

        for(int j=0;j<arr.length;j++){
            if(arr[j] != j+1){
                return arr[j];
            }
        }
        return -1;

    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }

}
