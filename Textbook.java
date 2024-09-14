/**
 * Matthew Cha
 * Class: Person
 * version 1.0
 * 9/13/2024
 *  Creates an OOP class for my personal book about cats
 */
public class Textbook {
    private String title;
    private String author;
    private int yearPublished;
    private String subject;

    // No-argument constructor with default values
    public Textbook() {
        this.title = "Cat's Algebra";
        this.author = "Isaac the turtle";
        this.yearPublished = 2035;
        this.subject = "Mathematics";
    }

    // 4-argument constructor to initialize instance variables
    public Textbook(String title, String author, int yearPublished, String subject) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.subject = subject;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getSubject() {
        return subject;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Instance method to check if the textbook is about a specific subject
    public boolean isSubjectMath() {
        return this.subject.equalsIgnoreCase("Mathematics");
    }

    // Overriding toString() method to provide readable format of textbook information
    @Override
    public String toString() {
        return "[Title=" + title + ", Author=" + author + ", Year Published=" + yearPublished + ", Subject=" + subject + "]";
    }
}