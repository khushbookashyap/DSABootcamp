package com.khushboo.searchAlgo;

import java.util.Arrays;

public class OccuranceIndex {

    //find the first and last index of a target element in ascending array
    //if not found return [-1,-1]

    public static void main(String[] args) {
        int arr[]= {-4,-2,1,4,7,7,7,7,45,56,67,78,90};
        int target = 7;
       traverseArray(findAns(arr,target));
    }

    public static int[] findAns(int[] arr, int target) {
        int[] ans = {-1,-1};
        int firstOccurance = findIndex(arr,target,true);
        int lastOccurance = findIndex(arr,target,false);
        ans[0]=firstOccurance;
        ans[1] = lastOccurance;

        return ans;
    }

    public static int findIndex(int[] arr, int target,boolean findFirstOccurance){
        int start = 0;
        int end = arr.length;
        int ans =-1;

        while (start <= end) {
             int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                ans = mid;
                if(findFirstOccurance) {
                    end = mid - 1;
                }else{
                    start = mid+1;
                }
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void traverseArray(int[] arr){
        for(int a : arr){
            System.out.println(a);
        }
    }
}

