package DAY4;

import java.util.Scanner;

public class ParkingFeeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vehicle Types: 1 - Two-Wheeler, 2 - Car");
        System.out.print("Enter Vehicle Type: ");
        int vehicleType = sc.nextInt();

        System.out.print("Enter Parking Hours: ");
        int hours = sc.nextInt();

        if (hours < 1 || hours > 12) {
            System.out.println("Invalid hours. Must be between 1 and 12.");
        } else {
            String vehicleName;
            double fee;

            switch (vehicleType) {
                case 1:
                    vehicleName = "Two-Wheeler";
                    fee = (hours == 1) ? 10 : 10 + (hours - 1) * 5;
                    break;
                case 2:
                    vehicleName = "Car";
                    fee = (hours == 1) ? 20 : 20 + (hours - 1) * 10;
                    break;
                default:
                    vehicleName = "Unknown";
                    fee = 0;
            }

            System.out.println();
            System.out.println("PARKING FEE");
            System.out.println("Vehicle: " + vehicleName);
            System.out.println("Hours: " + hours);
            System.out.printf("Fee: Rs. %.0f%n", fee);
        }

        sc.close();
    }
}
