package nivell2;

public class Main {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PaymentGateway();

        // Credit card payment
        CreditCard creditCard = new CreditCard("1234567812345678", "12/24", "123");
        paymentGateway.processPayment(creditCard, new PaymentCallback() {
            @Override
            public void onPaymentSuccess(String message) {
                System.out.println(message);
            }

            @Override
            public void onPaymentFailure(String message) {
                System.out.println(message);
            }
        });

        // Paypal payment
        Paypal paypal = new Paypal("examplemail@ple.com", "12345");
        paymentGateway.processPayment(paypal, new PaymentCallback() {
            @Override
            public void onPaymentSuccess(String message) {
                System.out.println(message);
            }

            @Override
            public void onPaymentFailure(String message) {
                System.out.println(message);
            }
        });

        // Bank account debt payment
        BankAccountDebt bankAccountDebt = new BankAccountDebt("1234567890", 1000.0);
        paymentGateway.processPayment(bankAccountDebt, new PaymentCallback() {
            @Override
            public void onPaymentSuccess(String message) {
                System.out.println(message);
            }

            @Override
            public void onPaymentFailure(String message) {
                System.out.println(message);
            }
        });
    }
}