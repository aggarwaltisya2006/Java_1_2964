package DAY5;
import java.util.Scanner;
public class FitnessCalorieRecommendation {
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter Height in metres: ");
        double height = sc.nextDouble();

        double bmi = calculateBMI(weight, height);
        String category = getBMICategory(bmi);

        String recommendation;
        switch (category) {
            case "Underweight":
                recommendation = "Increase calorie intake with a balanced diet.";
                break;
            case "Normal":
                recommendation = "Maintain regular exercise and balanced diet.";
                break;
            case "Overweight":
                recommendation = "Increase physical activity and monitor diet.";
                break;
            default:
                recommendation = "Consult a fitness expert for a tailored plan.";
        }

        System.out.println();
        System.out.println("FITNESS REPORT");
        System.out.printf("BMI: %.2f%n", bmi);
        System.out.println("Category: " + category);
        System.out.println("Recommendation: " + recommendation);

        sc.close();
    }
}
