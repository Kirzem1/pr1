package ru.mirea.lab1;

public class Pr14 {
    public static void main(String[] args){
        double sum = 0;
        for (int i = 1; i <= 10; i++){
            double element = 1.0 / i;
            sum += element;
            System.out.printf("Элемент %2d: %.4f%n", i, element);
        }
        System.out.printf("Сумма: %.4f%n", sum);
    }
}
