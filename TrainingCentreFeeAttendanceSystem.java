package DAY14;

import java.util.Scanner;

class Learner {
    String id;
    String name;
    double fee;
    double paid;
    int[] attendance = new int[7];

    Learner(String id, String name, double fee, double paid, int[] attendance) {
        this.id = id;
        this.name = name;
        this.fee = fee;
        this.paid = paid;
        this.attendance = attendance;
    }

    double calculatePendingFee() {
        return fee - paid;
    }

    double calculateAttendancePercentage() {
        int present = 0;
        for (int a : attendance) {
            present += a;
        }
        return (present / 7.0) * 100;
    }

    String isCertificateEligible() {
        boolean feeCleared = calculatePendingFee() == 0;
        boolean attendanceOk = calculateAttendancePercentage() >= 75;

        if (feeCleared && attendanceOk) {
            return "Eligible";
        } else if (!feeCleared) {
            return "Not Eligible (fee pending)";
        } else {
            return "Not Eligible (attendance shortage)";
        }
    }

    void displayReport() {
        System.out.println("LEARNER REPORT");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Pending Fee: Rs. %.2f%n", calculatePendingFee());
        System.out.printf("Attendance: %.2f%%%n", calculateAttendancePercentage());
        System.out.println("Certificate Eligibility: " + isCertificateEligible());
    }
}

public class TrainingCentreFeeAttendanceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Learner ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Course Fee: ");
        double fee = sc.nextDouble();
        System.out.print("Enter Amount Paid: ");
        double paid = sc.nextDouble();

        int[] attendance = new int[7];
        System.out.print("Enter Attendance for 7 Sessions (1/0): ");
        for (int i = 0; i < 7; i++) {
            attendance[i] = sc.nextInt();
        }

        Learner learner = new Learner(id, name, fee, paid, attendance);

        System.out.println();
        learner.displayReport();

        sc.close();
    }
}
