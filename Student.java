public class Student {
    private String firstName;
    private String lastName;
    private String specialty;
    private int course;
    private String group;
    private int GPA;

    public Student(String firstName, String lastName, String specialty, int course, String group, int GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.GPA = GPA;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getGPA() {
        return this.GPA;
    }

    public void setGPA(int GPA){
        this.GPA = GPA;
    }
}