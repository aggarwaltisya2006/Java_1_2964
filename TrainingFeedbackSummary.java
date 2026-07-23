package DAY3;

import java.util.Scanner;

public class TrainingFeedbackSummary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();
        System.out.print("Enter Content Rating (1-5): ");
        int content = sc.nextInt();
        System.out.print("Enter Explanation Rating (1-5): ");
        int explanation = sc.nextInt();
        System.out.print("Enter Practical Rating (1-5): ");
        int practical = sc.nextInt();

        int total = content + explanation + practical;
        double average = total / 3.0;

        System.out.println();
        System.out.println("TRAINING FEEDBACK");
        System.out.println("Content: " + content + "/5");
        System.out.println("Explanation: " + explanation + "/5");
        System.out.println("Practical Work: " + practical + "/5");
        System.out.printf("Average Rating: %.2f/5%n", average);

        sc.close();
    }
}
