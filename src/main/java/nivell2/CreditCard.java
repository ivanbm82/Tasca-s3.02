package nivell2;

public class CreditCard extends PaymentMethod {
    private String cardNumber;
    private String expirationDate;
    private String cvv;

    public CreditCard(String cardNumber, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public void processPayment(PaymentCallback callback) {

        boolean paymentSuccess = true; // Simulando un pago exitoso

        if (paymentSuccess) {
            callback.onPaymentSuccess("Credit card payment successful");
        } else {
            callback.onPaymentFailure("Error in credit card payment");
        }
    }
}
