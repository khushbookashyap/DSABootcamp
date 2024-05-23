package com.khushboo.sortAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateAndMissing {
    public static void main(String[] args) {
        int[] arr = {6,3,2,4,1,1};
        System.out.println(Arrays.toString(duplicateAndMissing(arr)));
    }

    private static int[] duplicateAndMissing(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }


        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return new int[]{arr[j], j + 1};
            }
        }
        return new int[]{-1, -1};

    }


    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void printList(List<Integer> list) {
        for (int i : list) {
            System.out.println(i);
        }
    }
}
