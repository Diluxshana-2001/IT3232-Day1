abstract class Book {
    private String title;
    private String author;

    public Book (String title, String author){
        this.title=title;
        this.author=author;
    }
    
    abstract void displayInfo();

class PrintedBook extends Book {
    public PrintedBook(String title, String author) {
        super(title, author);
    }
}
class EBook extends Book {
    private String fileSize;
    public EBook(String title, String author, String fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }
}

class AudioBook extends Book {
    private int pages; 

    public AudioBook(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }
}
}
public class Task7 {
    
}
