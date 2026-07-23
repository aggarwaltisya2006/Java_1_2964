package DAY13;

import java.util.Scanner;

class CartItem {
    String itemName;
    double unitPrice;
    int quantity;

    CartItem(String itemName, double unitPrice, int quantity) {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    CartItem updateQuantity(int quantity) {
        this.quantity = quantity;
        return this; // enables method chaining
    }

    double calculateAmount() {
        return this.unitPrice * this.quantity;
    }

    void display() {
        System.out.println("CART ITEM");
        System.out.println("Item: " + itemName);
        System.out.printf("Unit Price: Rs. %.2f%n", unitPrice);
        System.out.println("Updated Quantity: " + quantity);
        System.out.printf("Current Total: Rs. %.2f%n", calculateAmount());
    }
}

public class ShoppingCartItemUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Unit Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Initial Quantity: ");
        int initialQty = sc.nextInt();
        System.out.print("Enter Updated Quantity: ");
        int updatedQty = sc.nextInt();

        CartItem item = new CartItem(name, price, initialQty);
        item.updateQuantity(updatedQty); // method chaining demonstrated via return this

        System.out.println();
        item.display();

        sc.close();
    }
}
