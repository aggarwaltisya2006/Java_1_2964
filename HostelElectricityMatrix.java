package DAY9;
import java.util.Scanner;
public class HostelElectricityMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] units = new int[4][7];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("Enter units for Room " + (i + 1) + ", Day " + (j + 1) + ": ");
                units[i][j] = sc.nextInt();
            }
        }

        int hostelTotal = 0;
        System.out.println();
        for (int i = 0; i < 4; i++) {
            int roomTotal = 0;
            for (int j = 0; j < 7; j++) {
                roomTotal += units[i][j];
            }
            hostelTotal += roomTotal;
            System.out.println("Room " + (i + 1) + " Weekly Units: " + roomTotal);
        }
        System.out.println("Total Hostel Consumption: " + hostelTotal + " units");

        sc.close();
    }
}
