package gui;

import javax.swing.*;
import java.awt.*;

public class AdminPanel extends JPanel {

    public AdminPanel() {
        setLayout(new GridLayout(6, 2, 10, 10));

        JTextField titleField = new JTextField();
        JTextField authorField = new JTextField();
        JTextField yearField = new JTextField();
        JTextField genreField = new JTextField();

        JButton addButton = new JButton("Add Book");

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

        // Button Action
        addButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Book Added (logic coming next)");
        });
    }
}