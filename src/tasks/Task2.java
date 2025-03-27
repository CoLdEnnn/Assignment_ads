package tasks;

import java.util.Scanner;

public class Task2 {
    public static void problem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are given a number “n” and an array of “n” elements, write the function that returns average of them.");
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        double startTime = System.nanoTime();
        double result = avr(arr);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        System.out.println("The average is: " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    private static double avr(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }
}
