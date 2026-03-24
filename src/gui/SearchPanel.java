package gui;

import controller.SearchEngine;
import controller.SystemData;
import model.LibraryItem;

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

        // 🔍 SEARCH
        searchButton.addActionListener(e -> {
            String title = searchField.getText();
            String selected = (String) searchType.getSelectedItem();

            LibraryItem result;

            if ("Linear Search".equals(selected)) {
                result = SearchEngine.linearSearch(SystemData.libraryManager.getItems(), title);
            } else {
                SearchEngine.insertionSort(SystemData.libraryManager.getItems());
                result = SearchEngine.binarySearch(SystemData.libraryManager.getItems(), title);
            }

            JOptionPane.showMessageDialog(this,
                    result != null ? "Found: " + result.getTitle() : "Not found");
        });

        // 🔄 SORT
        sortButton.addActionListener(e -> {
            String selected = (String) sortType.getSelectedItem();

            if ("Insertion Sort".equals(selected)) {
                SearchEngine.insertionSort(SystemData.libraryManager.getItems());
            } else {
                SearchEngine.mergeSort(SystemData.libraryManager.getItems());
            }

            JOptionPane.showMessageDialog(this, "Sorted successfully!");
        });
    }
}