package nivell3;

public class Article {
    private String name;
    private double price;
    private String baseCurrency;
    private CurrencyConverter currencyConverter;

    public Article(String name, double price, String baseCurrency, CurrencyConverter currencyConverter) {
        this.name = name;
        this.price = price;
        this.baseCurrency = baseCurrency;
        this.currencyConverter = currencyConverter;// Dependencia inyectada a través del constructor
    }

    // Método para obtener el precio en la moneda base
    public double getPrice() {
        return price;
    }

    // Método para obtener el precio en una moneda específica, usando el conversor de moneda
    public double getPriceInCurrency(String currency) {
        double exchangeRate = currencyConverter.getExchangeRate(baseCurrency, currency);
        return price * exchangeRate;
    }
}
