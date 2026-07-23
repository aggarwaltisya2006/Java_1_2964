package DAY12;

import java.util.Scanner;

class Room {
    int roomNumber;
    String roomType;
    double dailyRate;
    boolean available;

    Room(int roomNumber, String roomType, double dailyRate) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.dailyRate = dailyRate;
        this.available = true;
    }

    double bookRoom(int days) {
        if (available) {
            available = false;
            return dailyRate * days;
        } else {
            System.out.println("Room already booked.");
            return 0;
        }
    }
}

public class HotelRoomBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Room Number: ");
        int roomNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Room Type: ");
        String roomType = sc.nextLine();
        System.out.print("Enter Daily Rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Stay Days: ");
        int days = sc.nextInt();

        Room room = new Room(roomNumber, roomType, rate);
        double amount = room.bookRoom(days);

        System.out.println();
        System.out.println("BOOKING DETAILS");
        System.out.println("Room: " + room.roomNumber + " - " + room.roomType);
        System.out.println("Days: " + days);
        System.out.printf("Total Amount: Rs. %.2f%n", amount);
        System.out.println("Status: " + (room.available ? "Available" : "Booked"));

        sc.close();
    }
}
