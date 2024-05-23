package com.khushboo.basic;

import java.util.Scanner;

public class PalindromeString {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String inputString = sc.next();
    boolean result = isPalindrome(inputString);
    System.out.println(result);
  }

  static boolean isPalindrome(String inputString){
    int strLength = inputString.length();
    for(int i=0; i<Math.floor(strLength/2); i++){
      if(inputString.charAt(i) != inputString.charAt(strLength-i-1)) {
        return false;
      }
    }
    return true;
  }

}
