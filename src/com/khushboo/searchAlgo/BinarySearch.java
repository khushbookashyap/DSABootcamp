package com.khushboo.searchAlgo;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-2,23,34,67,78};
        int index = binarySearch(arr,56);
        System.out.println("the number found at index:" + index);
    }

    private static int binarySearch(int[] arr, int num) {
        int start=0;
        int end=arr.length-1;

        while(start<= end){
            int mid = start +(end-start)/2;
            if(num == arr[mid]){
                return mid;
            }
            else if(num<arr[mid]){
                end = mid-1;
            }
            else if(num>arr[mid]){
                start=mid+1;
            }
        }
        return -1;
    }
}
