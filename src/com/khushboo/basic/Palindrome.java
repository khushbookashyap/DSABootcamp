package com.khushboo.basic;

import java.util.Scanner;

public class Palindrome {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    boolean result = palindrome(num);
    System.out.println(result);
  }

  static boolean palindrome(int n){
    int sum=0;
    int temp = n;

    while(n>0){
      int rem = n%10;
      n = n/10;
       sum = sum*10 + rem;
    }
    return sum==temp;
  }

}
