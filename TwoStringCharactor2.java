
package com.mycompany.problems;


public class TwoStringCharactor2 {
    public static void main(String[] args) {
        //
        String s1 = "Ram is my college student";
        String s2 = "Deepak is from sage university";
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i)!=' ')
                count1++;
        }
        System.out.println(count1);
        for(int i = 0; i<s2.length(); i++){
            if(s2.charAt(i)!=' ')
                count2++;
        }
        System.out.println(count2);
    }
         
    
}
