package perCasa.esercizi_08_06_2023.Esercizio3;

/*
Scrivi un programma Java che crea una classe Book con i campi isbn, title e author.
Il programma chiede all'utente di inserire i dati di tre libri e li salva in una mappa di oggetti Book, utilizzando l'ISBN come chiave.
Successivamente, scrivi i dati della mappa su un file di testo e leggi il file per estrarre e visualizzare i libri in base all'ISBN inserito dall'utente.
*/

public class Book {

    private int isbn;
    private String title;
    private String author;

    public Book(){

    }

    public Book(int isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
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

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ISBN: "+ isbn+ ", ");
        sb.append("title: "+ title+ ", ");
        sb.append("author: "+ author);
        return sb.toString();
    }
}
