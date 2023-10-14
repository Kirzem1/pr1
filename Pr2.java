public class Pr2 {
        public static void main(String[] args) {
            String[] array = {"Привет", "как", "дела", "?"};

            System.out.println("Исходный массив:");
            printArray(array);

            reverseArray(array);

            System.out.println("Массив после переворота:");
            printArray(array);
        }

        private static void reverseArray(String[] array) {
            int start = 0;
            int end = array.length - 1;

            while (start < end) {
                String temp = array[start];
                array[start] = array[end];
                array[end] = temp;

                start++;
                end--;
            }
        }

        private static void printArray(String[] array) {
            for (String element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
