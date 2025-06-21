package Exeptions;

public class ParseM {
    public static void main(String[] args) {
        String value = "abcd1224";
        try {
            int num = Integer.parseInt(value);
        } catch (NumberFormatException v) {
            System.out.println("Not a valid number...");
        }
    }
}
