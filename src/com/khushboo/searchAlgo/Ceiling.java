package com.khushboo.searchAlgo;

public class Ceiling {

    public static void main(String[] args) {
        int arr[]= {-4,-2,1,4,7,45,56,67,78,90};
        int target = 30;
        System.out.println("answer is " + findCeiling(arr,target));
    }

    public static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
