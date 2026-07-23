package DAY5;

import java.util.Scanner;

public class BankLoanEMIEstimator {
    public static double calculateInterest(double principal, double rate, double years) {
        return (principal * rate * years) / 100;
    }

    public static double calculateTotalPayable(double principal, double interest) {
        return principal + interest;
    }

    public static double calculateMonthlyInstallment(double totalPayable, int months) {
        return totalPayable / months;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Annual Interest Rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Loan Period in Years: ");
        double years = sc.nextDouble();
        System.out.print("Enter Number of Months: ");
        int months = sc.nextInt();

        double interest = calculateInterest(principal, rate, years);
        double totalPayable = calculateTotalPayable(principal, interest);
        double emi = calculateMonthlyInstallment(totalPayable, months);

        System.out.println();
        System.out.println("LOAN ESTIMATE");
        System.out.printf("Simple Interest: Rs. %.2f%n", interest);
        System.out.printf("Total Payable: Rs. %.2f%n", totalPayable);
        System.out.printf("Monthly Instalment: Rs. %.2f%n", emi);

        sc.close();
    }
}
