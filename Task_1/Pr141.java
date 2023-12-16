package Task_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pr141 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.println("Enter a regular expression to split the string: ");
        String regex = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        String[] elements = pattern.split(inputString);

        System.out.println("Elements after splitting the string:");
        for (String element : elements) {
            System.out.println(element);
        }

        System.out.println("Enter a regular expression to find in the string: ");
        regex = scanner.nextLine();

        pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputString);
        while (matcher.find()) {
            System.out.println("Found match: " + matcher.group());
        }
    }
}