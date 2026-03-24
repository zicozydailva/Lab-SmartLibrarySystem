package model;

public class Book extends LibraryItem implements Borrowable {
    private String genre;
    private boolean available = true;

    public Book(String id, String title, String author, int year, String genre) {
        super(id, title, author, year);
        this.genre = genre;
    }

    @Override
    public String getType() {
        return "Book";
    }

    @Override
    public void borrowItem() {
        available = false;
    }

    @Override
    public void returnItem() {
        available = true;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}