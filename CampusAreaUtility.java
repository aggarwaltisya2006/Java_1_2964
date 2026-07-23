package DAY6;
import java.util.Scanner;
public class CampusAreaUtility {
    public static double area(double side) {
        return side * side;
    }

    public static double area(double length, double width) {
        return length * width;
    }

    public static double area(int radius) {
        return 3.1416 * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shapes: 1 - Square, 2 - Rectangle, 3 - Circle");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        System.out.println();
        System.out.println("AREA RESULT");

        if (choice == 1) {
            System.out.print("Enter Side: ");
            double side = sc.nextDouble();
            System.out.println("Shape: Square");
            System.out.printf("Area: %.2f square units%n", area(side));

        } else if (choice == 2) {
            System.out.print("Enter Length: ");
            double length = sc.nextDouble();
            System.out.print("Enter Width: ");
            double width = sc.nextDouble();
            System.out.println("Shape: Rectangle");
            System.out.printf("Area: %.2f square units%n", area(length, width));

        } else if (choice == 3) {
            System.out.print("Enter Radius: ");
            int radius = sc.nextInt();
            System.out.println("Shape: Circle");
            System.out.printf("Area: %.2f square units%n", area(radius));

        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
