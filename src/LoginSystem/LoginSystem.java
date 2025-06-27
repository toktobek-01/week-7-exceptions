package LoginSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> users = new HashMap<>();

        System.out.println("📲 Welcome! Choose an option:");
        System.out.println("1 - Register");
        System.out.println("2 - Login");

        String choice = scanner.nextLine();

        try {
            if (choice.equals("1")) {
                // REGISTER
                System.out.print("Create username: ");
                String username = scanner.nextLine();

                System.out.print("Create password: ");
                String password = scanner.nextLine();

                if (username.isEmpty() || password.isEmpty()) {
                    throw new IllegalArgumentException("❌ Username or password cannot be empty.");
                }

                users.put(username, password);
                System.out.println("✅ Registered successfully! Now log in.");

            } else if (choice.equals("2")) {
                // LOGIN
                System.out.print("Username: ");
                String username = scanner.nextLine();

                System.out.print("Password: ");
                String password = scanner.nextLine();

                if (!users.containsKey(username) || !users.get(username).equals(password)) {
                    throw new LoginFailedException("❌ Invalid username or password.");
                }

                System.out.println("✅ Login successful. Welcome, " + username + "!");
            } else {
                System.out.println("❗ Invalid option.");
            }

        } catch (IllegalArgumentException | LoginFailedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("🧾 Session complete.");
            scanner.close();
        }
    }
}

