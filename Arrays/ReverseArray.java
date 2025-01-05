// Program to reverse an array

package com.company;

public class ReverseArray {

    // Method to reverse the given array
    public static void reverse(int[] numbers) {
        int start = 0;
        int end = numbers.length - 1;

        // Reversing the array using a while loop
        while (start < end) {
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;
            start++;
            end--;
        }
    }

    // Main method
    public static void main(String[] args) {
        // Sample array to test the reverse method
        int[] numbers = {3, 5, 4, 1, 9};

        // Call the reverse method
        reverse(numbers);

        // Print the reversed array
        System.out.print("Reversed array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
