package Exeptions;

public class ArgumentDemo {
    public static void main(String[] args) {
        printAge(-5);
    }

    public static void printAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative...");
        }
        System.out.println("Age is: " + age );

    }
}
