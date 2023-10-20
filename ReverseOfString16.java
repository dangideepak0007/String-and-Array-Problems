
package com.mycompany.problems;

public class ReverseOfString16 {
    public static void main(String[] arg) {

// declaring variable

String s1 = "Independent";

        // convert String to character array

        // by using toCharArray

        char[] resultarray = s1.toCharArray();

        //iteration

        for (int i = resultarray.length - 1; i >= 0; i--)

         // print reversed String

            System.out.print(resultarray[i]);

}
    
}
