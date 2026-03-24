package model;

public abstract class LibraryItem {
    protected String id;
    protected String title;
    protected String author;
    protected int year;

    public LibraryItem(String id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }

    public abstract String getType();
}