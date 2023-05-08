package nivell2;

public class BankAccountDebt extends PaymentMethod {
    private String accountNumber;
    private double amount;

    public BankAccountDebt(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    @Override
    public void processPayment(PaymentCallback callback) {

        boolean paymentSuccess = true; // Simulando un pago exitoso

        if (paymentSuccess) {
            callback.onPaymentSuccess("Bank account debt payment successful");
        } else {
            callback.onPaymentFailure("Error in bank account debt payment");
        }
    }
}
