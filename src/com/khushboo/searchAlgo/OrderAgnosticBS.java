package com.khushboo.searchAlgo;

public class OrderAgnosticBS {

    public static void main(String[] args) {
        int[] arr = {198,100,77,65,23,10,-2};
        int index = orderAgnosticBinarySearch(arr,23);
        System.out.println("the number found at index:" + index);
    }

    static int orderAgnosticBinarySearch(int[] arr, int num){
        int start=0;
        int end=arr.length-1;
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
}
