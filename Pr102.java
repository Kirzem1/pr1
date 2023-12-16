import java.util.Arrays;
import java.util.Comparator;

public class Pr102 {
    private Student[] GPA;

    public void setArray(Student[] students) {
        this.GPA = students;
    }

    public void quicksort(Comparator<Student> comparator) {
        Arrays.sort(GPA, comparator);
    }

    public void outArray() {
        for (Student student : GPA) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }

    public static void main(String[] args) {
        Student[] students = {new Student("Adam", "Sandler", "Computer", 3, "CS101", 228),
                new Student("Jane", "Unknown", "Mathematics", 2, "MA201", 775),
                new Student("Michael", "Jackson", "Physics", 4, "PH401", 336)};

        Pr102 sorter = new Pr102();
        sorter.setArray(students);

        Comparator<Student> courseComparator = Comparator.comparing(Student::getCourse);
        sorter.quicksort(courseComparator);

        Comparator<Student> gpaComparator = Comparator.comparingInt(Student::getGPA).reversed();
        sorter.quicksort(gpaComparator);
        sorter.outArray();
    }
}