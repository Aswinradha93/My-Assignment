package week4.day1;
public class Amazon extends CanaraBank {
    public void cashOnDelivery() {
        System.out.println("Payment method selected: Cash On Delivery");
    }
    public void upiPayments() {
        System.out.println("Payment method selected: UPI Payment");
    }
    public void cardPayments() {
        System.out.println("Payment method selected: Card Payment");
    }
    public void internetBanking() {
        System.out.println("Payment method selected: Internet Banking");
    }
    public static void main(String[] args) {
        Amazon order = new Amazon();
        order.cashOnDelivery();
        order.upiPayments();
        order.cardPayments();
        order.internetBanking();
        order.recordPaymentDetails();
    }
}
