package com.khushboo.basic;

import java.util.Scanner;

public class ArmstrongNumber {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    boolean result = checkArmstrong(num);
    System.out.println(result);
  }

  static boolean checkArmstrong(int num){

    int temp = num;
    int sum =0;
    while(num>0){
      int rem = num%10;
      sum= sum + rem*rem*rem;
      num = num/10;
    }
    return sum ==temp;

  }

}
