
package com.mycompany.arrays;

public class VoAndConsCount {
    public static void main(String[] args) {
    String str = "What you think about java";
    int vocount=0;
    int cocount=0;
    String str1 = str.toLowerCase();
    
    for(int i=0; i<str1.length(); i++){
        if(str.charAt(i)=='a'||str.charAt(i)=='e'){
        vocount++;
    }else if(str.charAt(i)>'a' && str.charAt(i)<='z')
        cocount++;
        
        }
        System.out.println(vocount);
        System.out.println(cocount);
    
    }    
    
}
