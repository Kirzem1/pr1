import java.util.HashMap;

public class Pr32 {
    private HashMap exchangeRates;

    public Pr32() {
        exchangeRates = new HashMap<>();
    }

    public void setExchangeRate(String currency, double rate) {
        exchangeRates.put(currency, rate);
    }

    public double convert(double amount, String fromCurrency, String toCurrency) {
        if (!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
            System.out.println("Курс обмена для указанной валюты не найден!");
            return -1;
        }
        double fromRate = (double) exchangeRates.get(fromCurrency);
        double toRate = (double) exchangeRates.get(toCurrency);

        return amount * (toRate / fromRate);
    }

    public static void main(String[] args) {
        Pr32 converter = new Pr32();
        converter.setExchangeRate("USD", 1.0);
        converter.setExchangeRate("EUR", 0.86);
        converter.setExchangeRate("GBP", 0.76);
        double amount = 100;
        double convertedAmount = converter.convert(amount, "USD", "EUR");
        System.out.println(amount + " USD = " + convertedAmount + " EUR");
    }
}