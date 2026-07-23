package DAY4;

import java.util.Scanner;

public class DigitalWalletMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        int choice;
        System.out.println();
        System.out.println("DIGITAL WALLET");

        do {
            System.out.println("1. Add Money");
            System.out.println("2. Make Payment");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Amount to Add: ");
                    double addAmount = sc.nextDouble();
                    if (addAmount > 0) {
                        balance += addAmount;
                        System.out.println("Money added successfully.");
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Payment Amount: ");
                    double payAmount = sc.nextDouble();
                    if (payAmount > 0 && payAmount <= balance) {
                        balance -= payAmount;
                        System.out.println("Payment completed.");
                    } else {
                        System.out.println("Payment failed. Invalid amount or insufficient balance.");
                    }
                    break;

                case 3:
                    System.out.printf("Current Balance: Rs. %.2f%n", balance);
                    break;

                case 4:
                    System.out.println("Thank you.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
