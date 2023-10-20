
package com.mycompany.problems;

public class RemoveWhiteSpaceInString10 {
    public static void main(String[] args) {
        
        String str1="Remove white spaces";    
            
        //Removes the white spaces using regex    
        str1 = str1.replaceAll("\\s+", "");    
            
        System.out.println("String after removing all the white spaces : " + str1);    
    }    
}    

