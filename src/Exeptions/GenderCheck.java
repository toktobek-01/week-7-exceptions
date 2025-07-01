package Exeptions;
import java.util.Scanner;

public class GenderCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            System.out.println("Enter your gender MALE/FEMALE: ");
            String gender = scanner.nextLine().toLowerCase();

            if (name.isEmpty() ||gender.isEmpty()) {
                throw new IllegalArgumentException("Name and gender canot be empty.");
            }

            if (!gender.equals("male") && !gender.equals("female")) {
                throw new InvalidGenderException("Gender must be MALE of FEMALE");
            }
            System.out.println("Hello, " + name + "! Gender registered as: " + gender);
        } catch (InvalidGenderException e) {
                System.out.println(e.getMessage());
            }
        }
    }

