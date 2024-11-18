package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {

    public static void main(String[] args) {

        try {
            File file = new File("C:\\Users\\shubu\\OneDrive\\Desktop\\LC.txt");

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write("Java programming is the best language....");
            } catch (IOException e) {
                System.out.println("Error writing to the file: " + e.getMessage());
            }

            System.out.println("Successfully wrote to the file");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}