// Program to find the minimum and maximum element in an array

package com.company;

class MinAndMax {

    // Method to find the minimum and maximum in the array
    public static void findMinAndMax(int[] numbers) {
        int min = Integer.MAX_VALUE;  // Start with the largest possible value
        int max = Integer.MIN_VALUE;  // Start with the smallest possible value

        // Loop through the array to find min and max
        for (int i = 0; i < numbers.length; i++) {
            // Update min if a smaller number is found
            if (numbers[i] < min) {
                min = numbers[i];
            }
            // Update max if a larger number is found
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Print the minimum and maximum values
        System.out.println("Your max element is: " + max);
        System.out.println("Your min element is: " + min);
    }

    // Main method
    public static void main(String[] args) {
        // Sample array to test the method
        int[] numbers = {2, 5, 1, 3, 0};

        // Call the method to find min and max
        findMinAndMax(numbers);
    }
}
