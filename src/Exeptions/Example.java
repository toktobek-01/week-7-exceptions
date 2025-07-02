package Exeptions;
import java.io.*;

public class Example {
    public static void main(String[] args) throws java.io.IOException {
        FileReader reader = new FileReader("file.txt");
        reader.close();

    }
}
