interface Printable {
    void print();
}

class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Book: " + title);
    }

    public static void printBooks(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Book) {
                item.print();
            }
        }
    }
}

class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Magazine: " + title);
    }
}

public class Pr74 {
    public static void main(String[] args) {
        Book[] library = {new Book("The Fellowship of the Ring"), new Book("National Geographic"), new Book("To Kill a Mockingbird")};
        Book.printBooks(library);
    }
}