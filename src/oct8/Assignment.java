package oct8;

public class Assignment {
    String title;
    String author;

    Assignment(){
        this.title = "Unknown";
        this.author = "Unknown";
        System.out.println("Unknown Title and author of the book");
    }
    Assignment(String title){
        this.title = title;
        this.author = "Unknown";
    }
    Assignment(String title, String author){
        this.title = title;
        this.author = author;
    }
}
