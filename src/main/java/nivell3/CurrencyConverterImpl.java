package nivell3;

public class CurrencyConverterImpl implements CurrencyConverter {
    @Override
    public double getExchangeRate(String sourceCurrency, String targetCurrency) {
        // Lógica real para obtener la tasa de cambio entre las dos monedas
        // En este ejemplo, se utiliza una lógica simple con valores fijos para ilustrar el concepto
        if (sourceCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            return 0.90; // 1 USD = 0.90 EUR
        } else if (sourceCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            return 1.11; // 1 EUR = 1.11 USD
        } else {
            throw new IllegalArgumentException("Exchange rate not found for the specified currencies");
        }
    }
}
