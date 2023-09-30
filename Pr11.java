package ru.mirea.lab1;
import java.util.Scanner;
public class Pr11 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int sum = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            count++;
        }
        double average = (double) sum / count;
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}

