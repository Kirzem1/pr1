public class Pr64 {
    interface Priceable {
        double getPrice();
    }

    static class Product implements Priceable {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }
    }

    static class Service implements Priceable {
        private String serviceName;
        private double hourlyRate;
        private int numberOfHours;

        public Service(String serviceName, double hourlyRate, int numberOfHours) {
            this.serviceName = serviceName;
            this.hourlyRate = hourlyRate;
            this.numberOfHours = numberOfHours;
        }

        public double getPrice() {
            return hourlyRate * numberOfHours;
        }

        public String getServiceName() {
            return serviceName;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Product product = new Product("Книга", 29.99);
            System.out.println("Товар: " + product.getName() + ", Цена: " + product.getPrice());

            Service service = new Service("Уборка", 15.0, 2);
            System.out.println("Услуга: " + service.getServiceName() + ", Цена: " + service.getPrice());
        }
    }
}
