import java.util.Scanner;

public class Pr74 implements MathCalculable{
    @Override
    public double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            double result = 1;
            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }
            return result;
        }
    }

    @Override
    public double abs(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }
    public static void main(String args[]){
            Pr74 bl = new Pr74();
            System.out.println(bl.power(7,4));
// Вычисление длины окружности

        }
}