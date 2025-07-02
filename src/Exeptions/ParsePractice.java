package Exeptions;

public class ParsePractice {
    public static void main(String[] args) {
        String input = "150";

        try {
            int num = Integer.parseInt(input);
            System.out.println(num);
        } catch (NumberFormatException n) {
            System.out.println("If number is printed the code is successfull...");

        }
    }
}
