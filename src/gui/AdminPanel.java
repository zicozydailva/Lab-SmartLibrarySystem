package gui;

import controller.SystemData;
import model.Book;
import utils.IDGenerator;
import utils.FileHandler;

import javax.swing.*;
import java.awt.*;

public class AdminPanel extends JPanel {

    private ViewPanel viewPanel;

    public AdminPanel(ViewPanel viewPanel) {
        this.viewPanel = viewPanel;

        // Layout (increased rows for extra button)
        setLayout(new GridLayout(7, 2, 10, 10));

        JTextField titleField = new JTextField();
        JTextField authorField = new JTextField();
        JTextField yearField = new JTextField();
        JTextField genreField = new JTextField();

        JButton addButton = new JButton("Add Book");
        JButton saveButton = new JButton("Save Data");

        // UI Components
        add(new JLabel("Title:"));
        add(titleField);

        add(new JLabel("Author:"));
        add(authorField);

        add(new JLabel("Year:"));
        add(yearField);

        add(new JLabel("Genre:"));
        add(genreField);

        add(new JLabel(""));
        add(addButton);

        add(new JLabel(""));
        add(saveButton);

        //  ADD BOOK LOGIC
        addButton.addActionListener(e -> {
            try {
                String title = titleField.getText();
                String author = authorField.getText();
                int year = Integer.parseInt(yearField.getText());
                String genre = genreField.getText();

                Book book = new Book(
                        IDGenerator.generateId(), //  Using IDGenerator
                        title,
                        author,
                        year,
                        genre
                );

                SystemData.libraryManager.addItem(book);

                JOptionPane.showMessageDialog(this, "Book Added Successfully!");

                //  Refresh table
                viewPanel.refreshTable();

                // 🧹 Clear fields
                titleField.setText("");
                authorField.setText("");
                yearField.setText("");
                genreField.setText("");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid Input!");
            }
        });

        //  SAVE DATA LOGIC
        saveButton.addActionListener(e -> {
            FileHandler.saveToFile(SystemData.libraryManager.getItems());
            JOptionPane.showMessageDialog(this, "Data saved successfully!");
        });
    }
}