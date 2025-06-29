package Exeptions;

import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter score (0–100): ");
            String input = scanner.nextLine();
            int score = Integer.parseInt(input);  // Might throw NumberFormatException

            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("❌ Score must be between 0 and 100.");
            }

            if (score < 50) {
                throw new FailingGradeException("❌ " + name + " has failed the exam.");
            }

            System.out.println("✅ " + name + " passed with a score of " + score + ".");

        } catch (NumberFormatException e) {
            System.out.println("⚠️ Please enter a valid number for score.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (FailingGradeException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("📋 Grading process complete.");
        }
    }
}
