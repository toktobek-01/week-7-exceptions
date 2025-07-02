package Exeptions;

public class MyExampleCatch {
    public static void main(String[] args) {
        try {
            int num = 29 / 0;
            System.out.println("Result: " + num);
        } catch (ArithmeticException n) {
            System.out.println("We cannot divide any number to ZERO !");
        }
    }
}
