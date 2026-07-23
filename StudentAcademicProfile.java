package DAY11;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int marks;
    int attendance;

    void assignData(int rollNo, String name, int marks, int attendance) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.attendance = attendance;
    }

    boolean calculateResult() {
        return marks >= 40;
    }

    void displayProfile() {
        String status = calculateResult() ? "PASS" : "FAIL";
        System.out.println(rollNo + " - " + name + " - Marks: " + marks +
                " - Attendance: " + attendance + "% - " + status);
    }
}

public class StudentAcademicProfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Marks: ");
            int marks = sc.nextInt();
            System.out.print("Attendance: ");
            int attendance = sc.nextInt();
            sc.nextLine();

            students[i].assignData(roll, name, marks, attendance);
        }

        System.out.println();
        System.out.println("STUDENT PROFILES");
        for (int i = 0; i < n; i++) {
            students[i].displayProfile();
        }

        sc.close();
    }
}