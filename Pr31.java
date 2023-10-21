import java.util.Arrays;
import java.util.Random;
public class Pr31 {
    public static void main(String[] args) {
        int size = 10;

        double[] array1 = new double[size];
        for (int i = 0; i < size; i++) {
            array1[i] = Math.random();
        }
        System.out.println("Массив с использованием метода random() класса Math:");
        printArray(array1);
        Arrays.sort(array1);
        System.out.println("Отсортированный массив:");
        printArray(array1);

        Random random = new Random();
        double[] array2 = new double[size];
        for (int i = 0; i < size; i++) {
            array2[i] = random.nextDouble();
        }
        System.out.println("\nМассив с использованием класса Random:");
        printArray(array2); // Вывод массива на экран
        Arrays.sort(array2); // Сортировка массива
        System.out.println("Отсортированный массив:");
        printArray(array2);
    }
    public static void printArray(double[] array) {
        for (double value : array) {
            System.out.println(value);
        }
        System.out.println();
    }
}
