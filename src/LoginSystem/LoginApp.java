package LoginSystem;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";

        try {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            // Check for empty input
            if (username.isEmpty() || password.isEmpty()) {
                throw new IllegalArgumentException("❌ Username and password cannot be empty.");
            }

            // Simulate login check
            if (!username.equals(correctUsername) || !password.equals(correctPassword)) {
                throw new LoginFailedException("❌ Login failed. Invalid credentials.");
            }

            System.out.println("✅ Login successful. Welcome, " + username + "!");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (LoginFailedException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("🧾 Login process complete.");
        }
    }
}
