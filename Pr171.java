package Task_2;

public class Pr171 {
    public static void main(String[] args) {
        Pr172  model = new Pr172("Someone Unknown", 20.0, 140);
        Pr174 view = new Pr174();
        Pr173 controller = new Pr173(model, view);

        controller.updateView();

        controller.setEmployeeHourlyRate(25.0);
        controller.updateView();
    }
}