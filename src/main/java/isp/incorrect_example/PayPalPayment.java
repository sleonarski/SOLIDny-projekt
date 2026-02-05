package isp.incorrect_example;

public class PayPalPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment...");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Processing refund...");
    }

    @Override
    public void sendPaymentLink(String email) {

    }

    @Override
    public void validateCardDetails(String cardNumber, String cvv, String expiry) {
        throw new UnsupportedOperationException("PayPal don't use Card");
    }

    @Override
    public void verifyBankAccount(String accountNumber) {

    }

    @Override
    public void generateQRCode() {

    }
}
