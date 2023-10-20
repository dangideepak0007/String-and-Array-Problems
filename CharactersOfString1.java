
package com.mycompany.problems;

public class CharactersOfString1{
    public static void main(String[] args) {
        String s1 = "Deepak";
        int ch = 0;
        
        for(int i = 0; i<=s1.length(); i++){
            if(s1.charAt(i)!=' ')
                ch++;
            }
        System.out.println(ch);
        }
}