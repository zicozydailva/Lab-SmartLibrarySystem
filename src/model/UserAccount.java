package model;

import java.util.ArrayList;
import java.util.List;

public class UserAccount {
    private String userId;
    private String name;
    private List<LibraryItem> borrowedItems;

    public UserAccount(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.borrowedItems = new ArrayList<>();
    }

    public void borrowItem(LibraryItem item) {
        borrowedItems.add(item);
    }

    public void returnItem(LibraryItem item) {
        borrowedItems.remove(item);
    }

    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    public String getName() {
        return name;
    }
}