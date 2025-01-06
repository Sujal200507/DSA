package com.company;

public class Main {

    /**
     * Checks if a given string is a palindrome.
     *
     * @param str the string to be checked
     * @param n the length of the string
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean palindrome(String str, int n) {
        for (int i = 0; i < n / 2; i++) { // Iterate only up to half the string
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false; // Not a palindrome
            }
        }
        return true; // Palindrome confirmed
    }

    public static void main(String[] args) {
        String str = "madam"; // Test input
        int n = str.length();

        System.out.println(palindrome(str, n)); // Expected Output: true
    }
}
