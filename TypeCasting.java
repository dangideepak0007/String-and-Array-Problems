
package com.mycompany.arrays;

public class TypeCasting {
    public static void main(String[] args) {
        byte bytedata = 35;
        int intdata = bytedata;
        
        System.out.println("Implicit = " + intdata);
        
        int intdata2 = 23344;
        byte bytedata2 = (byte) intdata2;
        System.out.println("Explicit = " + bytedata2);
        
        for(int i = 0; i<232; i++ ){
            System.out.println((byte) i);
        }
        
    }
            
    
}
