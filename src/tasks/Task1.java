package tasks;

import java.util.Scanner;

public class Task1 {
    public static void problem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are given a number “n” and an array of “n” elements, write the function that returns minimum of them.");

        int n;
        while (true) {
            System.out.print("Enter a positive number: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n >= 0) {
                    break;
                } else {
                    System.out.println("Error: Enter a non-negative number.");
                }
            } else {
                System.out.println("Error: Invalid input! Please enter a valid integer.");
                sc.next();
            }
        }

        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        double startTime = System.nanoTime();
        int result = findMin(arr);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        System.out.println("The minimum is: " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * This method finds the minimum number of given array
     * It uses a for loop to iterate through each number and compare
     */
    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}