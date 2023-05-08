package nivell2;

public class Paypal extends PaymentMethod {
    private String email;
    private String password;

    public Paypal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void processPayment(PaymentCallback callback) {
        boolean paymentSuccess = false; // Simulando un pago fallido

        if (paymentSuccess) {
            callback.onPaymentSuccess("Paypal payment successful");
        } else {
            callback.onPaymentFailure("Error in Paypal payment");
        }
    }
}