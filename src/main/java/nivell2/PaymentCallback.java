package nivell2;

public interface PaymentCallback {
    void onPaymentSuccess(String message);
    void onPaymentFailure(String message);
}