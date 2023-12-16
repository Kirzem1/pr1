package Task_8;

import java.util.Arrays;
import java.util.Scanner;

interface Filter {
    boolean apply(Object o);
}

public class Pr143 {
    public static <T> T[] filter(T[] array, Filter filter) {
        int count = 0;
        for (T t : array) {
            if (filter.apply(t)) {
                count++;
            }
        }
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new String[count];
        int index = 0;
        for (T t : array) {
            if (filter.apply(t)) {
                result[index] = t;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length to filter by: ");
        int length = scanner.nextInt();

        String[] strings = {"apple", "banana", "cherry", "date"};

        Filter filter = new Filter() {
            @Override
            public boolean apply(Object o) {
                return ((String) o).length() > length;
            }
        };

//        String[] filteredStrings = filter(strings, filter);
        Arrays.stream(strings)
                .filter(s -> s.length() > length)
                .forEach(System.out::println);
//        for (var s : filteredStrings) {
//            System.out.println(s);
//        }
    }
}