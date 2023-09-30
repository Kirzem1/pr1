package ru.mirea.lab1;
import java.util.Scanner;
public class Pr12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++){
            System.out.print("Элемент " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];
        int index = 1;
        do {
            sum += numbers[index - 1];
            index++;
        } while (index <= size);
        index = 1;
        while (index < size){
            if (numbers[index] > max){
                max = numbers[index];
            }
            if (numbers[index] < min){
                min = numbers[index];
            }
            index++;
        }
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}
