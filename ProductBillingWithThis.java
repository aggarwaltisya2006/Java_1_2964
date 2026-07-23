package DAY13;

import java.util.Scanner;

class Product {
    String id;
    String name;
    double price;
    int quantity;

    Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalValue() {
        return this.price * this.quantity;
    }

    void displayProduct() {
        System.out.println("PRODUCT BILL");
        System.out.println("Product: " + this.id + " - " + this.name);
        System.out.printf("Price: Rs. %.2f%n", this.price);
        System.out.println("Quantity: " + this.quantity);
        System.out.printf("Total Value: Rs. %.2f%n", calculateTotalValue());
    }
}

public class ProductBillingWithThis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        Product product = new Product(id, name, price, quantity);

        System.out.println();
        product.displayProduct();

        sc.close();
    }
}
