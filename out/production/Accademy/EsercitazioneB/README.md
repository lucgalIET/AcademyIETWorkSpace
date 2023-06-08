# EsercitazioneB


Progetto biblioteca:

Creare una classe Library.Library.Book per rappresentare un libro con i seguenti attributi:

il titolo del libro
l'autore del libro
il numero di copie disponibili del libro
il codice del libro

Creare Library.Library per gestire la biblioteca, con i seguenti metodi:

void addBook(Library.Library.Book book): aggiunge un libro alla biblioteca
void lendBook(String title): presta un libro agli utenti
void returnBook(String title): restituisce un libro precedentemente prestato
List<Library.Library.Book> searchBooksByAuthor(String author): restituisce una lista di libri di un determinato autore
List<Library.Library.Book> searchBooksByTitle(String title): restituisce una lista di libri con un determinato titolo
int getTotalCopies(): restituisce il numero totale di copie di libri presenti nella biblioteca

Creare Library.Printable con il metodo void printDetails() per stampare i dettagli di un libro.

Implementare l'interfaccia Library.Printable nella classe Library.Library.Book, in modo che quando viene chiamato il metodo printDetails() su un oggetto di tipo Library.Library.Book, vengano stampati i dettagli del libro (titolo, autore, copie disponibili).

Creare una classe abstract BookValidator con un metodo abstract boolean validate(Library.Library.Book book) per validare se un libro soddisfa determinati criteri. Successivamente, creare due classi che estendono BookValidator e implementano il metodo validate() in modo diverso, ad esempio:

Library.TitleValidator: verifica se il titolo del libro contiene solo caratteri alfabetici.
Library.Library.AuthorValidator: verifica se il nome dell'autore contiene solo caratteri alfabetici.
Utilizzare una struttura dati appropriata per gestire i libri nella biblioteca (ad esempio, List, Set o Map).

Utilizzare un'enum per definire una lista di generi di libri (ad esempio, FANTASY, ROMANCE, THRILLER).

Implementare una classe Library.LibraryIterator che implementa l'interfaccia Iterator<Library.Library.Book> e consente di iterare sui libri presenti nella biblioteca.

Utilizzare le espressioni lambda per effettuare ricerche personalizzate sulla biblioteca, ad esempio:

Cerca libri con un titolo che inizia con una determinata lettera
Cerca libri con un autore che contiene una determinata stringa


Gestire le eccezioni in modo appropriato per situazioni come:
Tentativo di prestare un libro non disponibile
Tentativo di restituire un libro non prestato

Nota: È possibile aggiungere ulteriori funzionalità e miglioramenti all'applicazione, se lo si desidera.
