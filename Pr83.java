import java.util.Scanner;

public class Pr83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число N: ");
        int N = scanner.nextInt();

        int sum = calculateDigitSum(N);

        System.out.println("Сумма цифр числа N: " + sum);
    }

    public static int calculateDigitSum(int number) {
        if (number < 10) {
            return number;
        } else {
            return number % 10 + calculateDigitSum(number / 10);
        }
    }
}
