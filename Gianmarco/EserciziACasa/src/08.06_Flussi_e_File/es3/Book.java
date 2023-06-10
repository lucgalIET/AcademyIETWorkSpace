package es3;

public class Book {
    private int ISBN;
    private String title;
    private String author;

    public Book() {
    }

    public Book(int ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Libro: " + title+'\'' +
                ", ISBN: " + ISBN +'\'' +
                ", Autore: " + author;
    }

}
