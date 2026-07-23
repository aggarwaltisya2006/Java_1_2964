package DAY9;
import java.util.Scanner;
public class QuizResponseEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] answerKey = new char[10];
        char[] responses = new char[10];

        System.out.println("Enter the Answer Key (10 letters, one at a time):");
        for (int i = 0; i < 10; i++) {
            answerKey[i] = sc.next().charAt(0);
        }

        System.out.println("Enter Student Responses (use X for unattempted):");
        for (int i = 0; i < 10; i++) {
            responses[i] = sc.next().charAt(0);
        }

        int correct = 0, incorrect = 0, unattempted = 0;
        for (int i = 0; i < 10; i++) {
            if (responses[i] == 'X') {
                unattempted++;
            } else if (responses[i] == answerKey[i]) {
                correct++;
            } else {
                incorrect++;
            }
        }

        System.out.println();
        System.out.println("QUIZ RESULT");
        System.out.println("Correct Answers: " + correct);
        System.out.println("Incorrect Answers: " + incorrect);
        System.out.println("Unattempted: " + unattempted);

        sc.close();
    }
}
