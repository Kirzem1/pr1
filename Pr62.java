public class Pr62 {
    interface Printable {
        void print();
    }

    static class Book implements Printable {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public void print() {
            System.out.println("Book Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Printable printable = new Book("To Kill a Mockingbird", "Harper Lee");
            printable.print();
        }
    }
}
