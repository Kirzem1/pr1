import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student2 {
    private String name;
    private String dateOfBirth;

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String[] formatDateOfBirth(String[] formats) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dob;
        try {
            dob = sdf.parse(dateOfBirth);
        } catch (ParseException e) {
            return new String[]{"Invalid date format"};
        }
        String[] formattedDates = new String[formats.length];
        for (int i = 0; i < formats.length; i++) {
            SimpleDateFormat outputFormat = new SimpleDateFormat(formats[i]);
            formattedDates[i] = outputFormat.format(dob);
        }
        return formattedDates;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student's date of birth (yyyy-MM-dd): ");
        String dateOfBirth = scanner.nextLine();

        Student2 student2;
        student2 = new Student2();
        student2.setName(name);
        student2.setDateOfBirth(dateOfBirth);

        System.out.print("Enter the formats for date of birth (e.g. dd/MM/yyyy, yyyy-MM-dd, EEEE, MMMM d, yyyy): ");
        String inputFormats = scanner.nextLine();
        String[] formats = inputFormats.split(", ");

        String[] formattedDates = student2.formatDateOfBirth(formats);
        for (int i = 0; i < formats.length; i++) {
            System.out.println("Formatted date of birth (" + formats[i] + "): " + formattedDates[i]);
        }

        System.out.print("Enter the format for date of birth (1 - dd/MM/yyyy, 2 - yyyy-MM-dd, 3 - EEEE, 4 - MMMM d, yyyy): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                formats = new String[]{"dd/MM/yyyy"};
                break;
            case 2:
                formats = new String[]{"yyyy-MM-dd"};
                break;
            case 3:
                formats = new String[]{"EEEE"};
                break;
            case 4:
                formats = new String[]{"MMMM d, yyyy"};
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        formattedDates = student2.formatDateOfBirth(formats);
        for (int i = 0; i < formats.length; i++) {
            System.out.println("Formatted date of birth (" + formats[i] + "): " + formattedDates[i]);
        }

        scanner.close();
    }
}