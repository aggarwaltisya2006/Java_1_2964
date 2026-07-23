package DAY10;
import java.util.Scanner;
public class StudentNameFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String first = sc.nextLine().trim();
        System.out.print("Enter Middle Name: ");
        String middle = sc.nextLine().trim();
        System.out.print("Enter Last Name: ");
        String last = sc.nextLine().trim();

        String firstFormatted = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        String middleFormatted = middle.substring(0, 1).toUpperCase() + middle.substring(1).toLowerCase();
        String lastFormatted = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();

        String fullName = firstFormatted + " " + middleFormatted + " " + lastFormatted;
        String initials = firstFormatted.charAt(0) + ". " + middleFormatted.charAt(0) + ". " + lastFormatted;

        System.out.println();
        System.out.println("Formatted Name: " + fullName);
        System.out.println("Initial Format: " + initials);

        sc.close();
    }
}
