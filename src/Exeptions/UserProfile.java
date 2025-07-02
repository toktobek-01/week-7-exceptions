package Exeptions;

import java.util.Scanner;

public class UserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            System.out.println("Enter your age: ");
            String ageInput = scanner.nextLine();
            int age = Integer.parseInt(ageInput);

            System.out.println("Enter your gender MALE/FEMALE: ");
            String gender = scanner.nextLine().toLowerCase();

            if (name.isEmpty()) {
                throw new EmptyNameException("Name cannot be empty: ");
            }
            if (age < 18) {
                throw new UnderAgeException("You must be at least 18 years old... ");
            }
            if (!gender.equals("male") && !gender.equals("female")) {
                throw new InvalidGenderException("Gender must be MALE or FEMALE");
            }
            System.out.println("Registration successfull!");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
        } catch (EmptyNameException | UnderAgeException | InvalidGenderException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please, enter a valid number for age!");
        } finally {
            scanner.close();
            System.out.println("Registration complete.");
        }
    }
}
