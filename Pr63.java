public class Pr63 {
    interface Printable {
        void print();
    }

    static class Shop implements Printable {
        private String name;
        private String address;

        public Shop(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public void print() {
            System.out.println("Shop Name: " + name);
            System.out.println("Address: " + address);
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Printable printable = new Shop("MyShop", "123 Main St");
            printable.print();
        }
    }
}
