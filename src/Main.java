import Tasks.Task1;
import Tasks.Task2;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("\n---Main Menu---");
            System.out.println("1. Task 1");
            System.out.println("2. Task 2");
            System.out.println("3. Task 3");
            System.out.println("4. Task 4");
            System.out.println("5. Task 5");
            System.out.println("6. Task 6");
            System.out.println("7. Task 7");
            System.out.println("8. Task 8");
            System.out.println("9. Task 9");
            System.out.println("10. Task 10");
            System.out.println("11. Bonus Tasks");
            System.out.println("12. Exit");
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

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;
                case 11:

                    break;
                case 12:
                    System.out.println("Exiting the program...");
                    exit = true;
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
