package DAY10;
import java.util.Scanner;
public class CollegeEmailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email: ");
        String email = sc.nextLine().trim();

        String requiredDomain = "@chitkara.edu.in";

        int firstAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');

        boolean valid = true;

        if (firstAt <= 0) {
            valid = false; // no @ or @ is the first character
        }
        if (firstAt != lastAt) {
            valid = false; // more than one @
        }
        if (!email.endsWith(requiredDomain)) {
            valid = false;
        }

        System.out.println();
        System.out.println("EMAIL VALIDATION");
        System.out.println("Email: " + email);
        System.out.println("Status: " + (valid ? "Valid college email" : "Invalid email"));

        sc.close();
    }
}
