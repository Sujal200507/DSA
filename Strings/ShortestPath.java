package com.company;

public class Main {

    /**
     * Calculates the shortest path from the origin after following the given path.
     *
     * @param path the string containing movement directions (N, S, W, E)
     * @param n the length of the path string
     * @return the shortest distance as a float
     */
    public static float shortestPath(String path, int n) {
        int x = 0; // Horizontal position
        int y = 0; // Vertical position

        for (int i = 0; i < n; i++) {
            char dir = Character.toUpperCase(path.charAt(i)); // Normalize to uppercase

            switch (dir) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'W':
                    x--;
                    break;
                case 'E':
                    x++;
                    break;
                default:
                    System.out.println("Invalid direction: " + dir);
                    break;
            }
        }

        // Calculate the shortest path using the Pythagorean theorem
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN"; // Path input
        int n = path.length(); // Length of the input path

        // Output the shortest path
        System.out.println("Shortest Path: " + shortestPath(path, n)); // Expected Output: 5.0
    }
}
