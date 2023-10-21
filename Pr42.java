// Enum для названий марок компьютера
enum Brand {
    DELL,
    HP,
    LENOVO,
    APPLE
}

// Класс Processor
class Processor {
    private String model;
    private double clockSpeed;

    public Processor(String model, double clockSpeed) {
        this.model = model;
        this.clockSpeed = clockSpeed;
    }

    public String getModel() {
        return model;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }
}

// Класс Memory
class Memory {
    private String type;
    private int capacity;

    public Memory(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}

// Класс Monitor
class Monitor {
    private String brand;
    private double size;

    public Monitor(String brand, double size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public double getSize() {
        return size;
    }
}

// Класс Computer
class Computer {
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public String getBrand() {
        return brand.name();
    }

    public String getProcessorModel() {
        return processor.getModel();
    }

    public double getProcessorClockSpeed() {
        return processor.getClockSpeed();
    }

    public String getMemoryType() {
        return memory.getType();
    }

    public int getMemoryCapacity() {
        return memory.getCapacity();
    }

    public String getMonitorBrand() {
        return monitor.getBrand();
    }

    public double getMonitorSize() {
        return monitor.getSize();
    }
}

// Тестовый класс для демонстрации программы

public class Pr42 {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i7", 3.6);
        Memory memory = new Memory("DDR4", 16);
        Monitor monitor = new Monitor("LG", 24);

        Computer computer = new Computer(Brand.HP, processor, memory, monitor);

        System.out.println("Марка компьютера: " + computer.getBrand());
        System.out.println("Процессор: " + computer.getProcessorModel() + ", Частота: " + computer.getProcessorClockSpeed());
        System.out.println("Память: " + computer.getMemoryType() + ", Объем: " + computer.getMemoryCapacity());
        System.out.println("Монитор: " + computer.getMonitorBrand() + ", Размер: " + computer.getMonitorSize());
    }
}