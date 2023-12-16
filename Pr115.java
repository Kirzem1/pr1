import java.util.Date;

public class Pr115 {
    public static void main(String[] args) {
        String developerLastName = "Тихогромов";

        Date startDate = new Date();

        startDate.setMonth(8);

        Date endDate = new Date();

        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + startDate);
        System.out.println("Дата и время сдачи задания: " + endDate);
    }
}