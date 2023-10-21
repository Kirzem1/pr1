public class Pr41 {
    public enum TimeOfYear {
        Весна(15),
        Лето(30),
        Осень(20),
        Зима(0);

        private int averageTemperature;

        TimeOfYear(int averageTemperature) {
            this.averageTemperature = averageTemperature;
        }

        public int getAverageTemperature() {
            return averageTemperature;
        }

        public String getDescription() {
            switch (this) {
                case Лето:
                    return "Теплое время года";
                default:
                    return "Холодное время года";
            }
        }
    }

    public static void main(String[] args) {
        TimeOfYear favoriteSeason = TimeOfYear.Лето;
        System.out.println("Мое любимое время года: " + favoriteSeason.name());
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature() + "°C");
        System.out.println("Описание: " + favoriteSeason.getDescription());
        System.out.println();

        for (TimeOfYear season : TimeOfYear.values()) {
            System.out.println("Время года: " + season.name());
            System.out.println("Средняя температура: " + season.getAverageTemperature() + "°C");
            System.out.println("Описание: " + season.getDescription());
            System.out.println();
        }
    }
}
