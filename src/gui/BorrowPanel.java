package gui;

import controller.SearchEngine;
import controller.SystemData;
import model.LibraryItem;
import model.UserAccount;

import javax.swing.*;
import java.awt.*;

public class BorrowPanel extends JPanel {

    public BorrowPanel() {
        setLayout(new GridLayout(4, 2, 10, 10));

        JTextField userField = new JTextField();
        JTextField itemField = new JTextField();

        JButton borrowButton = new JButton("Borrow");

        add(new JLabel("User Name:"));
        add(userField);

        add(new JLabel("Item Title:"));
        add(itemField);

        add(borrowButton);

        borrowButton.addActionListener(e -> {
            String userName = userField.getText();
            String title = itemField.getText();

            LibraryItem item = SearchEngine.linearSearch(
                    SystemData.libraryManager.getItems(), title
            );

            if (item != null) {
                UserAccount user = new UserAccount(userName, userName);
                SystemData.borrowController.borrowItem(user, item);
            } else {
                JOptionPane.showMessageDialog(this, "Item not found!");
            }
        });
    }
}