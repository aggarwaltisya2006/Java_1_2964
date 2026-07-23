package DAY8;
import java.util.Scanner;
public class MonthlySalesPerformance {
    static Scanner sc = new Scanner(System.in);

    public static void readSales(double[] sales) {
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for Month " + (i + 1) + ": ");
            sales[i] = sc.nextDouble();
        }
    }

    public static double calculateTotal(double[] sales) {
        double total = 0;
        for (double s : sales) {
            total += s;
        }
        return total;
    }

    public static double calculateAverage(double[] sales) {
        return calculateTotal(sales) / sales.length;
    }

    public static int countTargetMonths(double[] sales, double target) {
        int count = 0;
        for (double s : sales) {
            if (s >= target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        double[] sales = new double[12];
        readSales(sales);

        System.out.print("Enter Target: ");
        double target = sc.nextDouble();

        double total = calculateTotal(sales);
        double average = calculateAverage(sales);
        int targetMonths = countTargetMonths(sales, target);

        System.out.println();
        System.out.println("SALES PERFORMANCE");
        System.out.printf("Annual Sales: Rs. %.2f%n", total);
        System.out.printf("Average Monthly Sales: Rs. %.2f%n", average);
        System.out.println("Months Achieving Target: " + targetMonths);

        sc.close();
    }
}
