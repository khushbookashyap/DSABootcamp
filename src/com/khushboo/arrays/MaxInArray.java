package com.khushboo.arrays;

import java.util.Scanner;

public class MaxInArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {-23,-45,-6,-300,-2,-7,-78};
   System.out.println(findMax(arr));
  }

static int findMax(int[] arr)
{
  int max = arr[0];
  for(int i=0;i<arr.length;i++){
    if(arr[i] > max){
      max = arr[i];
    }
  }
  return max;
}
}
