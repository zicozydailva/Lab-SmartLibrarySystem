package controller;

import model.LibraryItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LibraryManager {
    private List<LibraryItem> items;
    private Stack<LibraryItem> undoStack;

    public LibraryManager() {
        items = new ArrayList<>();
        undoStack = new Stack<>();
    }

    // Add item
    public void addItem(LibraryItem item) {
        items.add(item);
    }

    // Remove item (with undo support)
    public void removeItem(LibraryItem item) {
        items.remove(item);
        undoStack.push(item);
    }

    // Undo last removal
    public void undoLastAction() {
        if (!undoStack.isEmpty()) {
            LibraryItem item = undoStack.pop();
            items.add(item);
            System.out.println("Undo successful: " + item.getTitle());
        } else {
            System.out.println("Nothing to undo");
        }
    }

    // Get all items
    public List<LibraryItem> getItems() {
        return items;
    }
}