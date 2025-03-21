abstract class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    abstract void displayInfo();
}

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

public class Task7 {
    public static void main(String[] args) {
        Book book1 = new PrintedBook("Java Programming", "John Doe");
        Book book2 = new EBook("Python for Data Science", "Jane Smith", "15MB");
        Book book3 = new AudioBook("C++ Basics", "Alice Brown", 5.2);
        Book book4 = new PrintedBook("The Great Gatsby", "F. Scott Fitzgerald");
        Book book5 = new PrintedBook("To Kill a Mockingbird", "Harper Lee");
        Book book6 = new EBook("Data Science for Beginners", "Michael Lee", "20MB");
        Book book7 = new EBook("Introduction to Machine Learning", "Sarah Black", "25MB");
        Book book8 = new AudioBook("The Catcher in the Rye", "J.D. Salinger", 7.5);
        Book book9 = new AudioBook("1984", "George Orwell", 8.0);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
        book4.displayInfo();
        book5.displayInfo();
        book6.displayInfo();
        book7.displayInfo();
        book8.displayInfo();
        book9.displayInfo();
    }
}

// > java Task7
// Printed Book:
// Title: Java Programming
// Author: John Doe
// Type: Printed

// E-Book:
// Title: Python for Data Science
// Author: Jane Smith
// File Size: 15MB
// Type: E-Book

// Audio Book:
// Title: C++ Basics
// Author: Alice Brown
// Duration: 5.2 hours
// Type: Audio Book

// Printed Book:
// Title: The Great Gatsby
// Author: F. Scott Fitzgerald
// Type: Printed

// Printed Book:
// Title: To Kill a Mockingbird
// Author: Harper Lee
// Type: Printed

// E-Book:
// Title: Data Science for Beginners
// Author: Michael Lee
// File Size: 20MB
// Type: E-Book

// E-Book:
// Title: Introduction to Machine Learning
// Author: Sarah Black
// File Size: 25MB
// Type: E-Book

// Audio Book:
// Title: The Catcher in the Rye
// Author: J.D. Salinger
// Duration: 7.5 hours
// Type: Audio Book

// Audio Book:
// Title: 1984
// Author: George Orwell
// Duration: 8.0 hours
// Type: Audio Book