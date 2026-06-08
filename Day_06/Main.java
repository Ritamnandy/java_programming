
class Book {

    String name;
    String author;
    double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Book name:- " + name);
        System.out.println("Book author:- " + author);
        System.out.println("Book price:- " + price);
    }
}

public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", 300);
        b1.display();
    }
}
