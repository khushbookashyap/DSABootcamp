package com.khushboo.basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(Arrays.toString(printFibonacci(n)));
  }

  static int[] printFibonacci(int n){
    int[] result = new int[n+1];

    for(int i=0;i<=n;i++){
      if(i==0 || i==1){
        result[i]=i;
      }else{
        result[i]=result[i-2]+result[i-1];
      }
    }
    return result;
  }

}
