package menuManagers;

import tasks.Task1;
import tasks.Task2;
import tasks.Task3;
import tasks.Task4;
import tasks.Task5;
import tasks.Task6;
import tasks.Task7;
import tasks.Task8;
import tasks.Task9;
import tasks.Task10;

import java.util.Scanner;

public class menu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void callTasksMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n---Tasks Menu---");
            System.out.println("1. Choose Task 1-10");
            System.out.println("11. Back");
            System.out.print("Your choice: ");
            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    Task1.problem();
                    break;
                case 2:
                    Task2.problem();
                    break;
                case 3:
                    Task3.problem();
                    break;
                case 4:
                    Task4.problem();
                    break;
                case 5:
                    Task5.problem();
                    break;
                case 6:
                    Task6.problem();
                    break;
                case 7:
                    Task7.problem();
                    break;
                case 8:
                    Task8.problem();
                    break;
                case 9:
                    Task9.problem();
                    break;
                case 10:
                    Task10.problem();
                    break;
                case 11:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static int getUserChoice() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input! Please enter a number: ");
            }
        }
    }
}
