import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pr101 {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Adam", "Sandler", "Computer", 3, "CS101", 228));
        list1.add(new Student("Jane", "Unknown", "Mathematics", 2, "MA201", 775));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Michael", "Jackson", "Physics", 4, "PH401", 336));

        List<Student> mergedList = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;

        Comparator<Student> courseCodeComparator = Comparator.comparing(Student::getCourse);

        while (index1 < list1.size() && index2 < list2.size()) {
            if (courseCodeComparator.compare(list1.get(index1), list2.get(index2)) < 0) {
                mergedList.add(list1.get(index1));
                index1++;
            } else {
                mergedList.add(list2.get(index2));
                index2++;
            }
        }

        while (index1 < list1.size()) {
            mergedList.add(list1.get(index1));
            index1++;
        }

        while (index2 < list2.size()) {
            mergedList.add(list2.get(index2));
            index2++;
        }

        Comparator<Student> mergedComparator = Comparator.comparing(Student::getCourse).thenComparingInt(Student::getGPA).reversed();
        mergedList.sort(mergedComparator);

        for (Student student : mergedList) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " - " + student.getCourse() + " - GPA: " + student.getGPA());
        }
    }
}