package Exeptions;

public class ArrayException {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException an) {
            System.out.println("Invalid index in Array");
        }
    }
}
