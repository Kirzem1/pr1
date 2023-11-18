import java.util.Scanner;
public interface MathCalculable {
    // Объявление числа PI
    static double PI = Math.PI;

    // Функция возведения в степень
    double power(double base, int exponent);

    // Модуль комплексного числа
    double abs(double a, double b);
}
