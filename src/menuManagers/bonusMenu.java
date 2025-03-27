package menuManagers;

import java.util.Scanner;

public class bonusMenu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void callBonusMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n---Bonus Menu---");
            System.out.println("1. Choose Bonus Task 1-8");
            System.out.println("2. Back");
            System.out.print("Your choice: ");
            int choice = getUserChoice();
            switch (choice) {
                case 1:

                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
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
