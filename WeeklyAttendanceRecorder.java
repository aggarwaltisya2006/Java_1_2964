package DAY7;
import java.util.Scanner;
public class WeeklyAttendanceRecorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] attendance = new int[7];

        for (int i = 0; i < 7; i++) {
            int value;
            do {
                System.out.print("Enter attendance for Day " + (i + 1) + " (1=Present, 0=Absent): ");
                value = sc.nextInt();
                if (value != 0 && value != 1) {
                    System.out.println("Invalid value. Enter only 0 or 1.");
                }
            } while (value != 0 && value != 1);
            attendance[i] = value;
        }

        int presentDays = 0;
        for (int i = 0; i < 7; i++) {
            if (attendance[i] == 1) {
                presentDays++;
            }
        }
        int absentDays = 7 - presentDays;
        double percentage = (presentDays / 7.0) * 100;

        System.out.println();
        System.out.println("WEEKLY ATTENDANCE");
        System.out.println("Present Days: " + presentDays);
        System.out.println("Absent Days: " + absentDays);
        System.out.printf("Attendance: %.2f%%%n", percentage);

        sc.close();
    }
}
