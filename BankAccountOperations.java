package DAY11;
import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Invalid withdrawal. Check amount or balance.");
        }
    }

    void displayAccount() {
        System.out.println("ACCOUNT SUMMARY");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder: " + holderName);
        System.out.printf("Final Balance: Rs. %.2f%n", balance);
    }
}

public class BankAccountOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        System.out.print("Enter Account Number: ");
        account.accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Holder Name: ");
        account.holderName = sc.nextLine();
        System.out.print("Enter Opening Balance: ");
        account.balance = sc.nextDouble();

        System.out.print("Enter Deposit Amount: ");
        double depositAmt = sc.nextDouble();
        account.deposit(depositAmt);

        System.out.print("Enter Withdrawal Amount: ");
        double withdrawAmt = sc.nextDouble();
        account.withdraw(withdrawAmt);

        System.out.println();
        account.displayAccount();

        sc.close();
    }
}