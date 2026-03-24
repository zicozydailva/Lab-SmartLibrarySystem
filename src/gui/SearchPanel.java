package gui;

import javax.swing.*;
import java.awt.*;

public class SearchPanel extends JPanel {

    public SearchPanel() {
        setLayout(new GridLayout(5, 2, 10, 10));

        JTextField searchField = new JTextField();

        String[] algorithms = {"Linear Search", "Binary Search"};
        JComboBox<String> searchType = new JComboBox<>(algorithms);

        String[] sortOptions = {"Insertion Sort", "Merge Sort"};
        JComboBox<String> sortType = new JComboBox<>(sortOptions);

        JButton searchButton = new JButton("Search");
        JButton sortButton = new JButton("Sort");

        add(new JLabel("Search Title:"));
        add(searchField);

        add(new JLabel("Search Type:"));
        add(searchType);

        add(searchButton);

        add(new JLabel("Sort Algorithm:"));
        add(sortType);

        add(sortButton);

        searchButton.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Search logic coming")
        );

        sortButton.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Sort logic coming")
        );
    }
}