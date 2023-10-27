public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("science", "The Machine Stop");
        library.addBook("science", "At the Earth's Core ");
        library.addBook("science", "Anthem");
        library.addBook("science", "The Mysterious Island");

        library.displayLibrary();
    }
}
