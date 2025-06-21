package Exeptions;

public class NullPointerDemo {
    public static void main(String[] args) {
        String name = null;
 try{
     System.out.println(name.toUpperCase());
 } catch (NullPointerException h) {
     System.out.println("NullPointerException caught: " + h.getMessage());
      }
    }
}
