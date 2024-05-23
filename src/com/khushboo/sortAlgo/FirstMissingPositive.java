package com.khushboo.sortAlgo;

public class FirstMissingPositive {

    public static void main(String[] args) {
        //integer array of range [0,n]
        int [] arr ={1,-1,3,4};
        System.out.println(firstMissingPositive(arr));
    }

    private static int firstMissingPositive(int[] arr) {
        int  i =0;
        while(i<arr.length){
            int correctIndex = arr[i]-1; //1 to n
            if(arr[i] >0 && arr[i]<=arr.length && arr[i]!= arr[correctIndex]){
                swap(arr,i, correctIndex);
            }else{
                i++;
            }
        }

        for(int index=0;index<arr.length;index++){
            if(arr[index] != index+1){
                return index+1 ;
            }
        }
        return arr.length +1;
    }


    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
