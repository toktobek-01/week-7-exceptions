package Exeptions;

public class AgeEx {
    static void printHello(int age, String name) throws Exception {
        if (age < 18) {
            throw new Exception("User must be ate least 18 years old");
        }
        System.out.println("Hello" + name);
    }

    public static void main(String[] args) {
        try {
            printHello(13, "John");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
