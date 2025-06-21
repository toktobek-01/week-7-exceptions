package Exeptions;

public class IndexDemo {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3};

        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException n) {
            System.out.println("Array indes is out of bounds...");
        }
    }
}
