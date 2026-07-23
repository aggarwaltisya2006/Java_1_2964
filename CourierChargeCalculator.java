package DAY6;
import java.util.Scanner;
public class CourierChargeCalculator {
    public static double calculateCharge(double weight) {
        return weight * 50;
    }

    // Outstation delivery - weight and distance
    public static double calculateCharge(double weight, double distance) {
        return (weight * 50) + (distance * 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Delivery Types: 1 - Local, 2 - Outstation");
        System.out.print("Enter Delivery Type: ");
        int type = sc.nextInt();
        System.out.print("Enter Weight (kg): ");
        double weight = sc.nextDouble();

        double charge;
        String deliveryName;

        if (type == 1) {
            deliveryName = "Local";
            charge = calculateCharge(weight);

            System.out.println();
            System.out.println("COURIER CHARGE");
            System.out.println("Delivery: " + deliveryName);
            System.out.println("Weight: " + weight + " kg");
            System.out.printf("Charge: Rs. %.2f%n", charge);

        } else if (type == 2) {
            System.out.print("Enter Distance (km): ");
            double distance = sc.nextDouble();
            deliveryName = "Outstation";
            charge = calculateCharge(weight, distance);

            System.out.println();
            System.out.println("COURIER CHARGE");
            System.out.println("Delivery: " + deliveryName);
            System.out.println("Weight: " + weight + " kg");
            System.out.println("Distance: " + distance + " km");
            System.out.printf("Charge: Rs. %.2f%n", charge);

        } else {
            System.out.println("Invalid delivery type.");
        }

        sc.close();
    }
}
