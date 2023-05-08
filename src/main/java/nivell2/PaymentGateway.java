package nivell2;

public class PaymentGateway {
    public void processPayment(Object paymentMethod, PaymentCallback callback) {
        if (paymentMethod instanceof CreditCard) {
            CreditCard creditCard = (CreditCard) paymentMethod;
            creditCard.processPayment(callback);
        } else if (paymentMethod instanceof Paypal) {
            Paypal paypal = (Paypal) paymentMethod;
            paypal.processPayment(callback);
        } else if (paymentMethod instanceof BankAccountDebt) {
            BankAccountDebt bankAccountDebt = (BankAccountDebt) paymentMethod;
            bankAccountDebt.processPayment(callback);
        } else {
            callback.onPaymentFailure("Invalid payment method");
        }
    }

}