package Objects;

public class Book {
    String title;
    String author;

    Book(String anyTitle,String anyAuthor){
        this.title = anyTitle;
        this.author = anyAuthor;
    }

    String getTitle(){
        return this.title;
    }
    String getAuthor(){
        return this.author;
    }

    void setTitle(String newTitle){
        this.title = newTitle;
    }
    void setAuthor(String newAuthor){
        this.author = newAuthor;
    }
    void printInfo(){
        System.out.println("Название книги: " + title + " имя автора: " + author);
    }
}
