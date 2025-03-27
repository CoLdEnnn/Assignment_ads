package tasks;

import java.util.Scanner;

public class Task6 {
    public static void problem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are given numbers 'a' and 'n', write the function that returns 'a^n'.");

        int n, m;
        while (true) {
            System.out.print("Enter a positive number: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                m = sc.nextInt();
                if (n >= 0 || m >= 0) {
                    break;
                } else {
                    System.out.println("Error: Enter a non-negative number.");
                }
            } else {
                System.out.println("Error: Invalid input! Please enter a valid integer.");
                sc.next();
            }
        }

        double startTime = System.nanoTime();
        int result = powFunc(n, m);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        System.out.println(n + " to the power of " + m + " is " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    private static int powFunc(int n, int m) {
        return (int) Math.pow(n, m);
    }
}
