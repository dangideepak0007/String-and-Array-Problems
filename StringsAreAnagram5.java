
package com.mycompany.problems;

import java.util.Arrays;

public class StringsAreAnagram5 {
    public static void main(String[] args) {

    String s1 = "Race";
    String s2 = "Care";
    
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();

    // check if length is same
    if(s1.length() == s2.length()) {

      // convert strings to char array
      char[] charArray1 = s1.toCharArray();
      char[] charArray2 = s2.toCharArray();

      // sort the char array
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      // if sorted char arrays are same
      // then the string is anagram
      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println(s1 + " and " + s2 + " are anagram.");
      }
      else {
        System.out.println(s1 + " and " + s2 + " are not anagram.");
      }
    }
    else {
      System.out.println(s1 + " and " + s2 + " are not anagram.");
    
    }
}
}
