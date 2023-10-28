class Person {
    String fullName;
    int age;

    // Конструктор без параметров
    Person() {
        fullName = "";
        age = 0;
    }

    // Конструктор с параметрами
    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void move() {
        System.out.println(fullName + " движется");
    }

    void talk() {
        System.out.println(fullName + " говорит");
    }
}

public class Pr411 {
    public static void main(String[] args) {
// Создание объекта, используя конструктор без параметров
        Person person1 = new Person();
        person1.fullName = "Первый человек";
        person1.age = 20;
        person1.move();
        person1.talk();

// Создание объекта, используя конструктор с параметрами
        Person person2 = new Person("Второй человек", 30);
        person2.move();
        person2.talk();
    }
}