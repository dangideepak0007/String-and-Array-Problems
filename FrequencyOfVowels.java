
package com.mycompany.arrays;

public class FrequencyOfVowels {
    
    public static void main(String[] args) {
        // Initialize the array of vowels
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        // Initialize a 2D array to store the vowel and frequency pairs
        int[][] vowelFreq = new int[vowels.length][2];

        // Sample array of vowels
        char[] vowelArray = {'a', 'e', 'i', 'o', 'u', 'a', 'e', 'i', 'o', 'u', 'a', 'e'};

        // Count the frequency of each vowel and update the 2D array
        for (int i = 0; i < vowels.length; i++) {
            char vowel = vowels[i];
            int frequency = 0;
            for (char c : vowelArray) {
                if (c == vowel) {
                    frequency++;
                }
            }
            vowelFreq[i][0] = vowel;
            vowelFreq[i][1] = frequency;
        }

        // Print the 2D array
        for (int i = 0; i < vowels.length; i++) {
            System.out.println("Vowel: " + (char)vowelFreq[i][0] + ", Frequency: " + vowelFreq[i][1]);
        }

        // Search for the frequency of a specific string (e.g., "a")
        char searchChar = 'a';
        for (int i = 0; i < vowels.length; i++) {
            if (vowelFreq[i][0] == searchChar) {
                System.out.println("Frequency of '" + searchChar + "': " + vowelFreq[i][1]);
                return;
            }
        }
        System.out.println("'" + searchChar + "' not found in the vowel array.");
    }
}

    

