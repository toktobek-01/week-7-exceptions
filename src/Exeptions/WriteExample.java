package Exeptions;

import java.io.FileWriter;
import java.io.IOException;

public class WriteExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("users.txt");
            writer.write("Name: Tim\n");
            writer.write("Age: 22\n");
            writer.write("Gendale; Male\n");
            writer.close();
            System.out.println("Date written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
