package DAY9;
import java.util.Scanner;
public class InternalAssessmentSummary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] marks = new int[5][3];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for Student " + (i + 1) + ", Assessment " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            double average = total / 3.0;
            System.out.printf("Student %d: Total %d, Average %.2f%n", (i + 1), total, average);
        }

        sc.close();
    }
}
