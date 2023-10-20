package com.mycompany.arrays;

public class Arrayss {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = arr.length;
        arr[1] = 12;
        arr[2] = 13;
        arr[3] = 14;
        arr[4] = 15;
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(i);
        }
        System.out.println(arr[1]);
        String[] str;

        str = new String[5];
        str[0] = "What is you name";
        str[1] = "What you think about our company";
        str[2] = "What is your role in our company";
        str[3] = "Where you live ?";
        str[4] = "What is your hobbey";
        for (int i = 0; i < str.length; i++) {
            System.out.println(i);

        }
        System.out.println(str[1]);

        int[] num = new int[6];
        num[0] = 12;
        num[1] = 15;
        num[2] = 19;
        num[3] = 20;
        num[4] = 25;
        for (int i : num) 
            System.out.println(i);
    
        int rows = 4;
        int columns = 4;
 
        int[][] array = new int[rows][columns];
 
        int value = 1;
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                array[i][j] = value;
//                value++;
//            }
//        }
 
        System.out.println("The 2D array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                array[i][j] = value;
                //value++;
                System.out.print(array[i][j] + " ");
                
            }
            System.out.println();
        }
    
    }

}
