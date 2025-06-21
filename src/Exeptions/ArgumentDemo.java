package Exeptions;

public class ArgumentDemo {
    public static void main(String[] args) {
        try {
            printAge(-5);
        } catch (IllegalArgumentException n) {
            System.out.println("Error: " + n.getMessage());
        }

    }

    public static void printAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative...");
        }
        System.out.println("Age is: " + age );
    }
}
