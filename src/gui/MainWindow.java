package gui;

import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        setTitle("Smart Library System");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        // SHARE SAME VIEW PANEL
        ViewPanel viewPanel = new ViewPanel();

        tabbedPane.addTab("View Items", viewPanel);
        tabbedPane.addTab("Borrow/Return", new BorrowPanel());
        tabbedPane.addTab("Admin", new AdminPanel(viewPanel)); // IMPORTANT
        tabbedPane.addTab("Search & Sort", new SearchPanel());

        add(tabbedPane);

        setVisible(true);
    }
}