/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

/**
 *
 * @author Deepak Dangi
 */
public class CharacterCount {
     public static void main(String[] args) 
        {  
          String str = "Java is easy to learn";
          char c = 'a'; 
          int count = 0;
         
          char[] charArray = str.toCharArray();
          for(char ch : charArray)
            {
              if(ch == c)
                count++;
            }
          System.out.println("Total occurrence of character 'a' using 1st approach = "+count);
        
          // Second 
          int count2 = str.length() - str.replace("a", "").length();
          System.out.println("Total occurrence of character 'a' using 2nd approach = "+count2);
       }  
    
}
