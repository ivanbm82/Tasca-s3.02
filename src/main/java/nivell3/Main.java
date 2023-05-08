package nivell3;


public class Main {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverterImpl();

        Article article1 = new Article("Article 1", 100, "USD", currencyConverter);
        System.out.println("Price in USD: " + (String.format("Valor: %.2f",article1.getPrice())));
        System.out.println("Price in EUR: " + (String.format("Valor: %.2f",article1.getPriceInCurrency("EUR"))));

        Article article2 = new Article("Article 2", 150, "EUR", currencyConverter);
        System.out.println("Price in EUR: " + (String.format("Valor: %.2f",article2.getPrice())));
        System.out.println("Price in USD: " + (String.format("Valor: %.2f",article2.getPriceInCurrency("USD"))));
    }
}