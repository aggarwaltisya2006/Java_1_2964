package DAY2;

import java.util.Scanner;

public class SemesterResultCalculator {
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

        int total = m1 + m2 + m3 + m4 + m5;
        double percentage = (total / 500.0) * 100;
        boolean passed = percentage >= 40;

        System.out.println();
        System.out.println("SEMESTER RESULT");
        System.out.println("Total Marks: " + total + " / 500");
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Result: " + (passed ? "PASS" : "FAIL"));

        sc.close();
    }
}
