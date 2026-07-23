package DAY3;

import java.util.Scanner;

public class CafeteriaReceiptGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Name: ");
        String itemName = sc.nextLine();
        System.out.print("Enter Unit Price: ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter GST Rate: ");
        double gstRate = sc.nextDouble();

        double subtotal = unitPrice * quantity;
        double gstAmount = subtotal * gstRate / 100;
        double grandTotal = subtotal + gstAmount;

        System.out.println();
        System.out.println("CAFETERIA RECEIPT");
        System.out.println("Item: " + itemName);
        System.out.printf("Subtotal: Rs. %.2f%n", subtotal);
        System.out.printf("GST: Rs. %.2f%n", gstAmount);
        System.out.printf("Grand Total: Rs. %.2f%n", grandTotal);

        sc.close();
    }
}
