import java.util.LinkedList;

public class Science {
      
    String title;
    String penulis;
    String bahasa;
    String nama;
    float rate;
    int page

    public Book(String title, string penulis, string bahasa, string nama, float rate, int page) {
        this.title = title;
        this.penulis = penulis;
        this.bahasa = bahasa;
        this.nama = nama;
        this.rate = rate;
        this.page = page;
    }
}

class BookShelf {
    LinkedList<Book> books = new LinkedList<>();
}

class Library {
    LinkedList<BookShelf> bookshelves = new LinkedList<>();

    public void addBook(String shelfName, String bookTitle) {
        BookShelf targetShelf = null;

        for (BookShelf shelf : bookshelves) {
            if (shelfName.equals(shelf.title)) {
                targetShelf = shelf;
                break;
            }
        }

        if (targetShelf == null) {
            targetShelf = new BookShelf();
            targetShelf.title = shelfName;
            bookshelves.add(targetShelf);
        }

        Book newBook = new Book(bookTitle);
        targetShelf.books.add(newBook);
    }

    public void displayLibrary() {
        for (BookShelf shelf : bookshelves) {
            System.out.println("Shelf: " + shelf.title);
            for (Book book : shelf.books) {
                System.out.println("  - " + book.title);
            }
        }
    }
}

public class NestedLinkedList {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("science", "The Machine Stop");
        library.addBook("science", "At the Earth's Core ");
        library.addBook("science", "Anthem");
        library.addBook("science", "The Mysterious Island");
        
        library.displayLibrary();
    }
}
