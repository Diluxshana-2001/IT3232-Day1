abstract class Book {
    private String title;
    private String author;

    public Book (String title, String author){
        this.title=title;
        this.author=author;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    abstract void displayInfo();

class PrintedBook extends Book {
    public PrintedBook(String title, String author) {
        super(title, author);
    }
    void displayInfo() {
        System.out.println("Printed Book: ");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Type: Printed");
        System.out.println();
    }
}
class EBook extends Book {
    private String fileSize;
    public EBook(String title, String author, String fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }
    public String getFileSize() {
        return fileSize;
    }
    void displayInfo() {
        System.out.println("E-Book: ");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("File Size: " + getFileSize());
        System.out.println("Type: E-Book");
        System.out.println();
    }
}

class AudioBook extends Book {
    private double duration; 

    public AudioBook(String title, String author, double duration) {
        super(title, author);
        this.duration = duration;
    }
    public double getDuration() {
        return duration;
    }

    void displayInfo() {
        System.out.println("Audio Book: ");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Duration: " + getDuration() + " hours");
        System.out.println("Type: Audio Book");
        System.out.println();
    }
}
}
public class Task7 {
    
}
