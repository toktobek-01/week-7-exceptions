package Exeptions;

public class CatchExample {
    public static void main(String[] args) {
        try {
            int number = 49/0;
            System.out.println("Result: " + number);
        } catch (ArithmeticException n1) {
            System.out.println("You cannot divide any number to ZERO !!!");
        }
    }
}
