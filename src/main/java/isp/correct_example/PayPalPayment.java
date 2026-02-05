package isp.correct_example;

public class PayPalPayment implements PaymentProcessor, Refundable, PaymentLinkProvider {

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
        System.out.println("Sending link..");
    }
}
