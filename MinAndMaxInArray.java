
package com.mycompany.arrays;

public class MinAndMaxInArray {
     public static void main(String [] args)
       {          
          int [] numbers = {40,20,80,65,70,90,35,10};
          int maxValue = numbers[0];
          int minValue = numbers[0];
          for(int i=1;i < numbers.length;i++) 
            {  
              if(numbers[i] < minValue)
	         minValue = numbers[i];               
  
              if(numbers[i] > maxValue)
	         maxValue = numbers[i];
            }	
          System.out.println("Minimum number = "+minValue+" and maximum number = "+maxValue); 
        }
   }
    
