package Exeptions;

import java.util.Scanner;

public class AgeEx {
    static void printHello(int age, String name) throws Exception {
        if (age < 18) {
            throw new Exception("User must be ate least 18 years old");
        }
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty...");
        }
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            System.out.println("Enter your age: ");
            String ageInput = scanner.nextLine();
            int age = Integer.parseInt(ageInput);

            printHello(age, name);

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number for age.");
        } catch (IllegalArgumentException e ) {
            System.out.println(" ! " + e.getMessage());
        } catch (Exception e ) {
            System.out.println(" ! " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Successful!!!");
        }
    }
}
