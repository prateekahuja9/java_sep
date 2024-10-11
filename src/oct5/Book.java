package oct5;

public class Book {
    String title;
    String author;
    int yearPublished;
    double price;
    String genre;

    Book(String title){
        this.title = title;
    }
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    Book(String title, String author, int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }
    Book(String title, String author, int yearPublished, double price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }
    Book(String title, String author, int yearPublished, double price, String genre) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
        this.genre = genre;
    }

    public void Book(String title, String author, int yearPublished, double price, String genre) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
        this.genre = genre;
    }

}
