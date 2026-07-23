package DAY7;
import java.util.Scanner;
public class DailyExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] expenses = new double[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter expense for Day " + (i + 1) + ": ");
            expenses[i] = sc.nextDouble();
        }

        System.out.print("Enter Daily Budget Limit: ");
        double budgetLimit = sc.nextDouble();

        double total = 0;
        int overBudgetDays = 0;
        for (int i = 0; i < 7; i++) {
            total += expenses[i];
            if (expenses[i] > budgetLimit) {
                overBudgetDays++;
            }
        }
        double average = total / 7.0;

        System.out.println();
        System.out.println("EXPENSE REPORT");
        System.out.printf("Total Spending: Rs. %.2f%n", total);
        System.out.printf("Average Daily Spending: Rs. %.2f%n", average);
        System.out.println("Days Above Budget: " + overBudgetDays);

        sc.close();
    }
}
