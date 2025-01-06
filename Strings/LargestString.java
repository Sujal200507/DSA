package com.company;

/**
 * This program compares an array of strings and prints the lexicographically largest string.
 * It uses the `compareTo` method to compare strings alphabetically.
 */
public class Main {

    /**
     * Compares an array of strings and prints the lexicographically largest string.
     *
     * @param s1 the array of strings to be compared
     */
    public static void compare(String[] s1) {
        String largest = s1[0]; // Start with the first element as the largest

        // Loop through the array, comparing strings
        for (int i = 1; i < s1.length; i++) {
            if (largest.compareTo(s1[i]) < 0) { // Compare current largest with the next string
                largest = s1[i]; // Update if the current string is larger
            }
        }

        // Print the largest string
        System.out.println(largest);
    }

    public static void main(String[] args) {
        String[] s1 = {"apple", "mango", "banana"}; // Test array
        compare(s1); // Output: mango
    }
}
