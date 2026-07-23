package DAY5;

import java.util.Scanner;

public class ModularStudentResultService {
    public static int calculateTotal(int m1, int m2, int m3, int m4, int m5) {
        return m1 + m2 + m3 + m4 + m5;
    }

    public static double calculatePercentage(int total, int maxMarks) {
        return (total / (double) maxMarks) * 100;
    }

    public static boolean isPassed(double percentage) {
        return percentage >= 40;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in 1st subject: ");
        int m1 = sc.nextInt();
        System.out.print("Enter marks in 2nd subject: ");
        int m2 = sc.nextInt();
        System.out.print("Enter marks in 3rd subject: ");
        int m3 = sc.nextInt();
        System.out.print("Enter marks in 4th subject: ");
        int m4 = sc.nextInt();
        System.out.print("Enter marks in 5th subject: ");
        int m5 = sc.nextInt();

        int total = calculateTotal(m1, m2, m3, m4, m5);
        double percentage = calculatePercentage(total, 500);
        boolean passed = isPassed(percentage);

        System.out.println();
        System.out.println("STUDENT RESULT");
        System.out.println("Total: " + total);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Status: " + (passed ? "PASS" : "FAIL"));

        sc.close();
    }

}
