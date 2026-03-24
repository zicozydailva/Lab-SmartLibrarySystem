package gui;

import controller.SystemData;
import model.LibraryItem;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewPanel extends JPanel {

    private JTable table;
    private DefaultTableModel tableModel;

    public ViewPanel() {
        setLayout(new BorderLayout());

        String[] columns = {"ID", "Title", "Author", "Year", "Type"};

        tableModel = new DefaultTableModel(columns, 0);
        table = new JTable(tableModel);

        add(new JScrollPane(table), BorderLayout.CENTER);

        JLabel title = new JLabel("Library Items", JLabel.CENTER);
        add(title, BorderLayout.NORTH);

        refreshTable();
    }

    // Refresh method
    public void refreshTable() {
        tableModel.setRowCount(0);

        for (LibraryItem item : SystemData.libraryManager.getItems()) {
            tableModel.addRow(new Object[]{
                    item.getId(),
                    item.getTitle(),
                    item.getAuthor(),
                    item.getYear(),
                    item.getType()
            });
        }
    }
}