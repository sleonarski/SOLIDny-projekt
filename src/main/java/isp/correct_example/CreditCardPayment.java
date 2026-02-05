package isp.correct_example;

public class CreditCardPayment implements CardValidator, PaymentProcessor, Refundable{

    @Override
    public void validateCardDetails(String cardNumber, String cvv, String expiry) {
        System.out.println("Processing card validation...");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment...");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Processing refund...");
    }
}
