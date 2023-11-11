public class Pr61 {
    interface Printable {
        void print();
    }

    static class Document implements Printable {
        private String content;

        public Document(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Printable printable = new Document("This is a printable document.");
            printable.print();
        }
    }
}
