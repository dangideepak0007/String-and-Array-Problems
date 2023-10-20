
package com.mycompany.arrays;

public class Array2D {
    public static void main(String[] args) {
        int [][] arr2d = new int[4][2];
        arr2d[0][0] = 1;
        arr2d[0][1] = 2;
        arr2d[1][0] = 3;
        arr2d[1][1] = 4;
        arr2d[2][0] = 5;
        arr2d[2][1] = 6;
        arr2d[3][0] = 7;
        arr2d[3][1] = 8;
        for(int row = 0; row<=arr2d.length - 1; row++){
            System.out.println(row);
        }
        
    }
    
}
