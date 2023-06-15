package marcoMacri.src.eserciziCasa.Es_8_6_23;
//Esercizio 3:
//        Scrivi un programma Java che crea una classe Book con i campi isbn, title e author.
//        Il programma chiede all'utente di inserire i dati di tre libri e li salva in una mappa di oggetti Book, utilizzando l'ISBN come chiave.
//        Successivamente, scrivi i dati della mappa su un file di testo e leggi il file per estrarre e visualizzare i libri in base all'ISBN inserito dall'utente.
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

    public double getISBN() {
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
}
