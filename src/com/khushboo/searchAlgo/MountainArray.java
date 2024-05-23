package com.khushboo.searchAlgo;

public class MountainArray {
    //Find index of the peak of a mountain array

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,8,10,13,0};
        System.out.println("Element found at: "+findIndex(arr));
    }

    public static int findIndex(int[] arr){
        int start = 0;
        int end= arr.length-1;
        int mid = 0;
        while(start<end) {
             mid = start+ (end-start)/2;
            if(arr[mid]<arr[mid+1]){
                //we are in increasing part of the array, so we move start pointer and search in right side
                start =mid+1;
            }
            if(arr[mid]>arr[mid+1]){
                // you are in decresing part of array, so we move our end and search in left side
                end = mid;
            }
        }
        return start;
    }

    public static int binarySearch(int[] arr, int target,int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
