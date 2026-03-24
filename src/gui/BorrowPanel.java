package gui;

import javax.swing.*;
import java.awt.*;

public class BorrowPanel extends JPanel {

    public BorrowPanel() {
        setLayout(new GridLayout(4, 2, 10, 10));

        JTextField userField = new JTextField();
        JTextField itemField = new JTextField();

        JButton borrowButton = new JButton("Borrow");
        JButton returnButton = new JButton("Return");

        add(new JLabel("User Name:"));
        add(userField);

        add(new JLabel("Item Title:"));
        add(itemField);

        add(borrowButton);
        add(returnButton);

        borrowButton.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Borrow logic coming")
        );

        returnButton.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Return logic coming")
        );
    }
}