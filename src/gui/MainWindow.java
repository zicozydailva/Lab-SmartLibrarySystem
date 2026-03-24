package gui;

import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        setTitle("Smart Library System");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create Tabs
        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab("View Items", new ViewPanel());
        tabbedPane.addTab("Borrow/Return", new BorrowPanel());
        tabbedPane.addTab("Admin", new AdminPanel());
        tabbedPane.addTab("Search & Sort", new SearchPanel());

        add(tabbedPane);

        setVisible(true);
    }
}