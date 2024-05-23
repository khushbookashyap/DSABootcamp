package com.khushboo.searchAlgo;

public class InfiniteArray {
    //Find an element in ans infinite sorted array

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,56,67,78,89,90,123,234,456,567,678,789};
        int target = 234;
        System.out.println("Element fpund at: "+findIndex(arr,target));
    }

    public static int findIndex(int[] arr, int target){
        int start = 0;
        int end=1;
        int temp;
        while(target > arr[end]) {
            temp = end+1;
            end = end + (end - start +1) * 2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);
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
