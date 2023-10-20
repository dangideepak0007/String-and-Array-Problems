/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

/**
 *
 * @author Deepak Dangi
 */
public class SortArray {
    public static void main(String [] args)
       {          
          int [] numbers = {40,20,80,65,70,90,35,10};   
          int length = numbers.length;  
          int temp;  
          for(int i = 0; i < length; i++) 
            {
              for(int j = i + 1; j < length; j++) 
                {
                  if(numbers[i] > numbers[j]) 
                    {
                      temp = numbers[i];
                      numbers[i] = numbers[j];
                      numbers[j] = temp;
                    }
                }
            }
          
          
          System.out.println("Array elements in ascending Order:");
          for(int n : numbers) 
              System.out.print(n + " ");      
       }
    
}
