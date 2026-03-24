package controller;

import model.LibraryItem;

import java.util.ArrayList;
import java.util.List;

public class SystemData {

    public static LibraryManager libraryManager = new LibraryManager();
    public static BorrowController borrowController = new BorrowController();

    // Optional: store users
    public static List<String> users = new ArrayList<>();
}