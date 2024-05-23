package com.khushboo.searchAlgo;

public class SearchInMountainArray {
    //Find index of the peak of a mountain array

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 8, 10, 13, 3,2,1};
        int target = 1;
        System.out.println("Element target found at: " + search(arr,target));

    }

    static int search(int[] arr, int target){
        int peak = findIndex(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0,peak);
        if(firstTry!= -1){
            return firstTry;
        }
        return orderAgnosticBinarySearch(arr,target,peak+1,arr.length-1);
    }

    static int orderAgnosticBinarySearch(int[] arr, int num, int start, int end){
        //check if the array is in asc or desc order
        boolean isAsc = arr[start]<arr[end];

        while(start<= end){
            int mid = start +(end-start)/2;
            if(num == arr[mid]){
                return mid;
            }
            else if(num<arr[mid]){
                if(isAsc)
                    end = mid-1;
                else
                    start = mid+1;
            }
            else if(num>arr[mid]){
                if(isAsc)
                    start=mid+1;
                else
                    end = mid-1;
            }
        }
        return -1;
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
