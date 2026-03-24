package controller;

import model.Borrowable;
import model.LibraryItem;
import model.UserAccount;

import java.util.*;

public class BorrowController {

    private Map<LibraryItem, Queue<UserAccount>> reservationMap;

    public BorrowController() {
        reservationMap = new HashMap<>();
    }

    // Borrow item
    public void borrowItem(UserAccount user, LibraryItem item) {
        if (item instanceof Borrowable borrowable) {
            if (borrowable.isAvailable()) {
                borrowable.borrowItem();
                user.borrowItem(item);
                System.out.println(user.getName() + " borrowed " + item.getTitle());
            } else {
                // Add to queue
                reservationMap.putIfAbsent(item, new LinkedList<>());
                reservationMap.get(item).add(user);
                System.out.println("Item not available. Added to waitlist.");
            }
        }
    }

    // Return item
    public void returnItem(UserAccount user, LibraryItem item) {
        if (item instanceof Borrowable borrowable) {
            borrowable.returnItem();
            user.returnItem(item);
            System.out.println(user.getName() + " returned " + item.getTitle());

            // Check queue
            Queue<UserAccount> queue = reservationMap.get(item);
            if (queue != null && !queue.isEmpty()) {
                UserAccount nextUser = queue.poll();
                borrowItem(nextUser, item);
                System.out.println("Automatically assigned to next user.");
            }
        }
    }
}