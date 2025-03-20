public class App {
    public static void main(String[] args) {
        // Tạo đối tượng thanh toán bằng thẻ tín dụng
        Payment creditCard = new CreditCardPayment("1234-5678-9012-3456");
        creditCard.pay(100.50);

        // Tạo đối tượng thanh toán bằng PayPal
        Payment paypal = new PayPalPayment("user@example.com");
        paypal.pay(75.25);
    }
}
