package AccessModifier;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();
        library.setCategory("cATEGORY");
        library.setAuthor("author");
        library.setYear(10);
        library.setBookTitle("BookTitle");

        System.out.println(library.getCategory());
        System.out.println(library.getAuthor());
        System.out.println(library.getYear());
        System.out.println(library.getBookTitle());

    }
}
