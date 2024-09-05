package week_2;


class Book {
    private String title;
    private String author;

    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class P_55_Create_Object {
    public static void main(String[] args) {
        Book defaultBook = new Book();
        defaultBook.displayInfo();

        System.out.println();

        Book parameterizedBook = new Book("The Last Dance", "Kashyap Hainiya");
        parameterizedBook.displayInfo();
    }

}
