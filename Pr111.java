import java.util.ArrayList;
import java.util.LinkedList;

public class Pr111 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long arrayListInsertionTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        long linkedListInsertionTime = endTime - startTime;

        System.out.println("Время выполнения операции вставки для ArrayList: " + arrayListInsertionTime + " наносекунд");
        System.out.println("Время выполнения операции вставки для LinkedList: " + linkedListInsertionTime + " наносекунд");

        startTime = System.nanoTime();
        for (int i = 99999; i >= 0; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        long arrayListDeletionTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 99999; i >= 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        long linkedListDeletionTime = endTime - startTime;

        System.out.println("Время выполнения операции удаления для ArrayList: " + arrayListDeletionTime + " наносекунд");
        System.out.println("Время выполнения операции удаления для LinkedList: " + linkedListDeletionTime + " наносекунд");

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(0, i);
        }
        endTime = System.nanoTime();
        long arrayListAdditionTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(0, i);
        }
        endTime = System.nanoTime();
        long linkedListAdditionTime = endTime - startTime;

        System.out.println("Время выполнения операции добавления для ArrayList: " + arrayListAdditionTime + " наносекунд");
        System.out.println("Время выполнения операции добавления для LinkedList: " + linkedListAdditionTime + " наносекунд");

        startTime = System.nanoTime();
        arrayList.contains(99999);
        endTime = System.nanoTime();
        long arrayListSearchTime = endTime - startTime;

        startTime = System.nanoTime();
        linkedList.contains(99999);
        endTime = System.nanoTime();
        long linkedListSearchTime = endTime - startTime;

        System.out.println("Время выполнения операции поиска по образцу для ArrayList: " + arrayListSearchTime + " наносекунд");
        System.out.println("Время выполнения операции поиска по образцу для LinkedList: " + linkedListSearchTime + " наносекунд");
    }
}