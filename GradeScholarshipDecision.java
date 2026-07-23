package DAY4;

import java.util.Scanner;

public class GradeScholarshipDecision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Percentage: ");
        double percentage = sc.nextDouble();
        System.out.print("Enter Attendance: ");
        double attendance = sc.nextDouble();

        if (percentage < 0 || percentage > 100 || attendance < 0 || attendance > 100) {
            System.out.println("Validation: Invalid input, values must be 0-100");
        } else {
            String grade;
            if (percentage >= 90) {
                grade = "A+";
            } else if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B";
            } else if (percentage >= 60) {
                grade = "C";
            } else if (percentage >= 40) {
                grade = "D";
            } else {
                grade = "F";
            }

            boolean scholarshipEligible = (percentage >= 85 && attendance >= 90);

            System.out.println();
            System.out.println("ACADEMIC DECISION");
            System.out.println("Grade: " + grade);
            System.out.println("Scholarship: " + (scholarshipEligible ? "Eligible" : "Not Eligible"));
            System.out.println("Validation: Input accepted");
        }

        sc.close();
    }
}
