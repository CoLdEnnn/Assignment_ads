package menuManagers;

import tasks.Task1;

import java.util.Scanner;

public class bonusMenu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void callBonusMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n---Bonus Menu---");
            System.out.println("1. Choose Bonus Task 1-8");
            System.out.println("9. Back");
            System.out.print("Your choice: ");
            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    Task1.problem();
                    break;
                case 2:
                    Task1.problem();
                    break;
                case 3:
                    Task1.problem();
                    break;
                case 4:
                    Task1.problem();
                    break;
                case 5:
                    Task1.problem();
                    break;
                case 6:
                    Task1.problem();
                    break;
                case 7:
                    Task1.problem();
                    break;
                case 8:
                    Task1.problem();
                    break;
                case 9:
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
