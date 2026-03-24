package utils;

import model.LibraryItem;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileHandler {

    public static void saveToFile(List<LibraryItem> items) {
        try (FileWriter writer = new FileWriter("library.txt")) {

            for (LibraryItem item : items) {
                writer.write(item.getTitle() + "," +
                        item.getAuthor() + "," +
                        item.getYear() + "," +
                        item.getType() + "\n");
            }

            System.out.println("Data saved successfully!");

        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }
}