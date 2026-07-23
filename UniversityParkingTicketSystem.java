package DAY14;

import java.util.Scanner;

class Vehicle {
    String vehicleNumber;
    int type; // 1 = Two-wheeler, 2 = Car
    int hours;

    Vehicle(String vehicleNumber, int type, int hours) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.hours = hours;
    }
}

class ParkingTicket {
    Vehicle vehicle;
    double fee;

    ParkingTicket(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.fee = calculateFee();
    }

    double calculateFee() {
        if (vehicle.type == 1) {
            return (vehicle.hours == 1) ? 10 : 10 + (vehicle.hours - 1) * 5;
        } else {
            return (vehicle.hours == 1) ? 20 : 20 + (vehicle.hours - 1) * 10;
        }
    }

    void printTicket(int ticketNumber) {
        String vehicleTypeName = (vehicle.type == 1) ? "Two-wheeler" : "Car";
        System.out.printf("TICKET %d: %s, %s, %d hours, Fee Rs. %.0f%n",
                ticketNumber, vehicle.vehicleNumber, vehicleTypeName, vehicle.hours, fee);
    }
}

public class UniversityParkingTicketSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Vehicles: ");
        int n = sc.nextInt();
        sc.nextLine();

        ParkingTicket[] tickets = new ParkingTicket[n];
        double totalRevenue = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Vehicle " + (i + 1) + ":");
            System.out.print("Vehicle Number: ");
            String number = sc.nextLine();
            System.out.print("Type (1-Two-wheeler, 2-Car): ");
            int type = sc.nextInt();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            sc.nextLine();

            Vehicle vehicle = new Vehicle(number, type, hours);
            tickets[i] = new ParkingTicket(vehicle);
            totalRevenue += tickets[i].fee;
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            tickets[i].printTicket(i + 1);
        }
        System.out.printf("Total Revenue: Rs. %.0f%n", totalRevenue);

        sc.close();
    }
}
