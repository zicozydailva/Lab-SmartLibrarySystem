//import controller.LibraryManager;
//import controller.SearchEngine;
//import model.Book;
//import model.LibraryItem;
//
//public class Main {
//    public static void main(String[] args) {
//
//        LibraryManager manager = new LibraryManager();
//
//        manager.addItem(new Book("1", "Java Basics", "John", 2023, "Tech"));
//        manager.addItem(new Book("2", "Algorithms", "Jane", 2022, "CS"));
//        manager.addItem(new Book("3", "Data Structures", "Mike", 2021, "CS"));
//
//        // Linear Search
//        LibraryItem found1 = SearchEngine.linearSearch(manager.getItems(), "Algorithms");
//        System.out.println("Linear: " + (found1 != null ? found1.getTitle() : "Not found"));
//
//        // Recursive Search
//        LibraryItem found2 = SearchEngine.recursiveSearch(manager.getItems(), "Java Basics", 0);
//        System.out.println("Recursive: " + (found2 != null ? found2.getTitle() : "Not found"));
//
//        // Insertion Search
//        SearchEngine.insertionSort(manager.getItems());
//
//        System.out.println("After Sorting:");
//        for (LibraryItem item : manager.getItems()) {
//            System.out.println(item.getTitle());
//        }
//    }
//}

import gui.MainWindow;

public class Main {
    public static void main(String[] args) {
        new MainWindow();
    }
}