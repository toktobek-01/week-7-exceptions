package MultipleTypes;
import java.util.Scanner;
public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0;

        try {
            System.out.println("Enter deposit amount: ");
            String depositInput = scanner.nextLine();
            double deposit = Double.parseDouble(depositInput);

            if (deposit < 0) {
                throw new IllegalArgumentException("Deposit cannot be negative...");
            }

            balance += deposit;
            System.out.println("Deposit successful. Balance: $" + balance);

            System.out.println("Enter withdrawal amount: ");
            String withdrawalInput = scanner.nextLine();
            double withdraw = Double.parseDouble(withdrawalInput);

            if (withdraw < 0) {
                throw new IllegalArgumentException("Withdrawal cannot be negative...");
            }
            if (withdraw > balance) {
                throw new NegativeBalanceException("Cannot withdraw more than your balance...");
            }

            balance -= withdraw;
            System.out.println("Withdrawal successful. New balkance: $" + balance);
        } catch (NumberFormatException e) {
            System.out.println("Input must be a valid number...");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Transaction complete...");
        }
    }
}


