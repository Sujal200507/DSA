package com.company;

public class MinMax {

    public static void findMinMax(int[] arr) {
        // Initialize min and max values with the first element of the array
        int min = arr[0];
        int max = arr[0];

        // Iterate over the array to find the min and max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Print the results
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, -2, 7};
        findMinMax(arr);
    }
}
