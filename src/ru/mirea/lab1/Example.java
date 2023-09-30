package ru.mirea.lab1;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 2;
        System.out.print("Введитецелоечисло: ");
        if (sc.hasNextInt()) {
            i = sc.nextInt();
            System.out.println(i * 2);
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
};
