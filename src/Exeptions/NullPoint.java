package Exeptions;

public class NullPoint {
    public static void main(String[] args) {
        String name = "Name";
        try {
            System.out.println(name.length());
        } catch (NullPointerException n) {
            System.out.println("The variable is null....");
        }
    }
}
