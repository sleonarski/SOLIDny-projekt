package isp.incorrect_example;

public interface Payment {

    void processPayment(double amount);
    void refund(double amount);
    void validateCardDetails(String cardNumber, String cvv, String expiry);
    void sendPaymentLink(String email);
    void verifyBankAccount(String accountNumber);
    void generateQRCode();
}
