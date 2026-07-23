package DAY14;

import java.util.Scanner;

class StudentRecord {
    int rollNo;
    String name;
    int[] marks = new int[5];
    int attendance;

    StudentRecord(int rollNo, String name, int[] marks, int attendance) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.attendance = attendance;
    }

    int calculateTotal() {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        return total;
    }

    double calculateAverage() {
        return calculateTotal() / 5.0;
    }

    String getResult() {
        return calculateAverage() >= 40 ? "PASS" : "FAIL";
    }

    String getAttendanceStatus() {
        return attendance >= 75 ? "Satisfactory" : "Shortage";
    }

    void displayReport() {
        System.out.printf("%d %s - Total: %d, Average: %.2f, Result: %s, Attendance: %s%n",
                rollNo, name, calculateTotal(), calculateAverage(), getResult(), getAttendanceStatus());
    }
}

public class CollegeStudentProgressManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        StudentRecord[] students = new StudentRecord[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            int[] marks = new int[5];
            System.out.print("Enter 5 Marks: ");
            for (int j = 0; j < 5; j++) {
                marks[j] = sc.nextInt();
            }
            System.out.print("Attendance: ");
            int attendance = sc.nextInt();
            sc.nextLine();

            students[i] = new StudentRecord(roll, name, marks, attendance);
        }

        System.out.println();
        System.out.println("CLASS REPORT");
        for (int i = 0; i < n; i++) {
            students[i].displayReport();
        }

        sc.close();
    }
}
