package nivell2;

public abstract class PaymentMethod {
    public abstract void processPayment(PaymentCallback callback);
}