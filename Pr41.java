// Перечисление, содержащее названия времен года
enum Season {
Весна(10), Лето(30), Осень(15), Зима(0);

private int averageTemperature;

private Season(int averageTemperature) {
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

public class Pr41 {
public static void main(String[] args) {
// Создание переменной, содержащей любимое время года
Season favoriteSeason = Season.Лето;

// Вывод информации о любимом времени года
System.out.println("Любимое время года: " + favoriteSeason);
System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature() + "°C");
System.out.println("Описание: " + favoriteSeason.getDescription());

// Метод с использованием оператора switch
printSeasonDescription(Season.Лето);

// Распечатать все времена года, среднюю температуру и описание времени года
for (Season season : Season.values()) {
System.out.println("Время года: " + season);
System.out.println("Средняя температура: " + season.getAverageTemperature() + "°C");
System.out.println("Описание: " + season.getDescription());
System.out.println();
}
}

public static void printSeasonDescription(Season season) {
switch (season) {
case Лето:
System.out.println("Я люблю лето");
break;
case Осень:
System.out.println("Я люблю осень");
break;
case Зима:
System.out.println("Я люблю зиму");
break;
case Весна:
System.out.println("Я люблю весну");
break;
}
}
}
