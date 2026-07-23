package DAY6;
import java.util.Scanner;
public class ElectricityConsumptionEstimator {
    static final double RATE_PER_UNIT = 6.0;

    public static double calculateBill(int units) {
        return units * RATE_PER_UNIT;
    }

    public static double calculateBill(int units, double equipmentCharge) {
        return (units * RATE_PER_UNIT) + equipmentCharge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Consumer Types: 1 - Room, 2 - Laboratory");
        System.out.print("Enter Consumer Type: ");
        int type = sc.nextInt();
        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        System.out.println();
        System.out.println("ELECTRICITY ESTIMATE");

        if (type == 1) {
            double bill = calculateBill(units);
            System.out.println("Type: Room");
            System.out.printf("Total Cost: Rs. %.2f%n", bill);

        } else if (type == 2) {
            System.out.print("Enter Fixed Equipment Charge: ");
            double equipmentCharge = sc.nextDouble();
            double energyCharge = units * RATE_PER_UNIT;
            double totalBill = calculateBill(units, equipmentCharge);

            System.out.println("Type: Laboratory");
            System.out.printf("Energy Charge: Rs. %.2f%n", energyCharge);
            System.out.printf("Equipment Charge: Rs. %.2f%n", equipmentCharge);
            System.out.printf("Total Cost: Rs. %.2f%n", totalBill);

        } else {
            System.out.println("Invalid consumer type.");
        }

        sc.close();
    }
}
