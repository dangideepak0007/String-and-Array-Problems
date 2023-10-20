
package com.mycompany.problems;

public class ReplaceSpaceOfString12 {
     public static void main(String[] args){    
        String string = "Actions speak louder than words";    
        char ch = '-';            
        System.out.println("String before replacing spaces with given character: ");    
        System.out.println(string);         
        //Replace space with specific character ch    
        string = string.replace(' ', ch);                
        System.out.println("String after replacing spaces with given character: ");    
        System.out.println(string);    
    }    
}
