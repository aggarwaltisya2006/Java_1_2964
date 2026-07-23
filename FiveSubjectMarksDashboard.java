package DAY7;
import java.util.Scanner;
public class FiveSubjectMarksDashboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        for (int i = 0; i < 5; i++) {
            int value;
            do {
                System.out.print("Enter marks for Subject " + (i + 1) + ": ");
                value = sc.nextInt();
                if (value < 0 || value > 100) {
                    System.out.println("Invalid marks. Must be between 0 and 100.");
                }
            } while (value < 0 || value > 100);
            marks[i] = value;
        }

        int total = 0, passed = 0, failed = 0;
        for (int i = 0; i < 5; i++) {
            total += marks[i];
            if (marks[i] >= 40) {
                passed++;
            } else {
                failed++;
            }
        }
        double average = total / 5.0;

        System.out.println();
        System.out.println("MARKS DASHBOARD");
        System.out.println("Total: " + total);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Passed Subjects: " + passed);
        System.out.println("Failed Subjects: " + failed);

        sc.close();
    }
}
