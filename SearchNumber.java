/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

/**
 *
 * @author Deepak Dangi
 */
public class SearchNumber {
    public static void main(String [] args)
       {          
          int [] numbers = {40,60,80,65,70};
          boolean isExist = false;
          int searchNumber = 80;
          int pos = -1;
          for(int i = 0; i < numbers.length; i++)
            {
              if(numbers[i] == searchNumber)
                {
                  isExist = true;
                  pos = i;
                  break;
                }
            }
          if(isExist)
              System.out.println("number "+searchNumber+" exist in the array at index = "+pos);
          else
            System.out.println("number "+searchNumber+" does not exist inside the array");
        }
    
}
