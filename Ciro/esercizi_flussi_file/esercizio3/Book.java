package Ciro.esercizi_flussi_file.esercizio3;

public class Book {
    private final Integer isbn;
    private final String title;
    private final String author;

    public Book(Integer isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String toString(){
        String sb = "Book[ " +
                "Titolo: " + title + " " +
                "Autore: " + author +
                " ]";

        return sb;
    }
}
