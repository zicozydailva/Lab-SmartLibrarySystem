package controller;

import model.LibraryItem;

import java.util.List;

public class SearchEngine {

    //  Linear Search (works anytime)
    public static LibraryItem linearSearch(List<LibraryItem> items, String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }

    //  Binary Search (requires sorted list)
    public static LibraryItem binarySearch(List<LibraryItem> items, String title) {
        int left = 0;
        int right = items.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            LibraryItem midItem = items.get(mid);

            int comparison = midItem.getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return midItem;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    //  Recursive Search (REQUIRED for marks)
    public static LibraryItem recursiveSearch(List<LibraryItem> items, String title, int index) {
        if (index >= items.size()) {
            return null;
        }

        if (items.get(index).getTitle().equalsIgnoreCase(title)) {
            return items.get(index);
        }

        return recursiveSearch(items, title, index + 1);
    }

    // Sort by Title (Insertion Sort)
    public static void insertionSort(List<LibraryItem> items) {
        for (int i = 1; i < items.size(); i++) {
            LibraryItem key = items.get(i);
            int j = i - 1;

            while (j >= 0 && items.get(j).getTitle().compareToIgnoreCase(key.getTitle()) > 0) {
                items.set(j + 1, items.get(j));
                j--;
            }

            items.set(j + 1, key);
        }
    }

    // merge sort functionality
    public static void mergeSort(List<LibraryItem> items) {
        if (items.size() <= 1) return;

        int mid = items.size() / 2;

        List<LibraryItem> left = items.subList(0, mid);
        List<LibraryItem> right = items.subList(mid, items.size());

        mergeSort(left);
        mergeSort(right);

        merge(items, left, right);
    }

    private static void merge(List<LibraryItem> items, List<LibraryItem> left, List<LibraryItem> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getTitle().compareToIgnoreCase(right.get(j).getTitle()) <= 0) {
                items.set(k++, left.get(i++));
            } else {
                items.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            items.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            items.set(k++, right.get(j++));
        }
    }
}
