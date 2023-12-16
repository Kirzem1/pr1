package Task_2;

public class Pr173 {
    private Pr172 model;
    private Pr174 view;

    public Pr173(Pr172 model, Pr174 view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public void setEmployeeHourlyRate(double hourlyRate) {
        model.setHourlyRate(hourlyRate);
    }

    public void setEmployeeHoursWorked(int hoursWorked) {
        model.setHoursWorked(hoursWorked);
    }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.calculateSalary());
    }
}