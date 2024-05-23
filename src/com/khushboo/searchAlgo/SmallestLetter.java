package com.khushboo.searchAlgo;

public class SmallestLetter {

    //Given an arr of characters in ascending order, find the smallest letter larger than the
    //given target letter. Note that the letters wrap around

    public static void main(String[] args) {
        char arr[]= {'f','h','k'};
        char target = 'm';
        System.out.println("answer is " + findSmallestChar(arr,target));
    }

    public static char findSmallestChar(char[] arr, char target) {
        int start = 0;
        int end = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target >= arr[arr.length-1]){
                return arr[0];
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
