package DAY12;

import java.util.Scanner;

class Enrollment {
    String id;
    String learner;
    String course;
    double fee;
    String paymentStatus;

    // Complete constructor
    Enrollment(String id, String learner, String course, double fee, String paymentStatus) {
        this.id = id;
        this.learner = learner;
        this.course = course;
        this.fee = fee;
        this.paymentStatus = paymentStatus;
    }

    // Shorter constructor - chains to complete constructor with a default status
    Enrollment(String id, String learner, String course, double fee) {
        this(id, learner, course, fee, "Pending");
    }

    void display() {
        System.out.println("ENROLLMENT RECORD");
        System.out.println("ID: " + id);
        System.out.println("Learner: " + learner);
        System.out.println("Course: " + course);
        System.out.printf("Fee: Rs. %.2f%n", fee);
        System.out.println("Payment Status: " + paymentStatus);
    }
}

public class CourseEnrollmentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Enrollment ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Learner Name: ");
        String learner = sc.nextLine();
        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();
        System.out.print("Enter Fee: ");
        double fee = sc.nextDouble();

        Enrollment enrollment = new Enrollment(id, learner, course, fee);

        System.out.println();
        enrollment.display();

        sc.close();
    }
}
