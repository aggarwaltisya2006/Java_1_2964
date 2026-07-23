package DAY8;
import java.util.Scanner;
public class TaxAdjustedArray {
    public static double[] addTax(double[] prices, double taxRate) {
        double[] adjusted = new double[prices.length];
        for (int i = 0; i < prices.length; i++) {
            adjusted[i] = prices[i] + (prices[i] * taxRate / 100);
        }
        return adjusted;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Items: ");
        int n = sc.nextInt();
        double[] prices = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter price for Item " + (i + 1) + ": ");
            prices[i] = sc.nextDouble();
        }

        System.out.print("Enter GST Percentage: ");
        double gst = sc.nextDouble();

        double[] adjustedPrices = addTax(prices, gst);

        System.out.print("ORIGINAL PRICES: ");
        for (double p : prices) {
            System.out.printf("%.2f ", p);
        }
        System.out.println();

        System.out.print("GST-ADJUSTED PRICES: ");
        for (double p : adjustedPrices) {
            System.out.printf("%.2f ", p);
        }
        System.out.println();

        sc.close();
    }
}
