package DAY8;
import java.util.Scanner;
public class ClassAttendanceAnalysis {
    static Scanner sc = new Scanner(System.in);

    public static void readAttendance(double[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter attendance % for Student " + (i + 1) + ": ");
            values[i] = sc.nextDouble();
        }
    }

    public static double calculateAverage(double[] values) {
        double sum = 0;
        for (double v : values) {
            sum += v;
        }
        return sum / values.length;
    }

    public static int countShortage(double[] values, double limit) {
        int count = 0;
        for (double v : values) {
            if (v < limit) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();
        double[] attendance = new double[n];

        readAttendance(attendance);
        double average = calculateAverage(attendance);
        int shortageCount = countShortage(attendance, 75);

        System.out.println();
        System.out.println("CLASS ATTENDANCE");
        System.out.printf("Class Average: %.2f%%%n", average);
        System.out.println("Students Below 75%: " + shortageCount);

        sc.close();
    }
}
