package ru.mirea.lab1;

public class Pr15 {
    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args){
        int number = 8;
        int result = factorial(number);
        System.out.println("Факториал числа " + number + " равен " + result);
    }
}
