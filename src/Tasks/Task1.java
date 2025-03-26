package Tasks;

import java.util.Scanner;

public class Task1 {
    public static void problem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are given a number “n” and an array of “n” elements, write the function that returns minimum of them.");
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();
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