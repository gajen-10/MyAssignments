package org.testleaf.week4.day1;

public class amazon extends canaraBank{
    public void cashOnDelivery(){
        System.out.println("Cash on Delivery is eligible");

    }
    public void upiPayments(){
        System.out.println("upiPaymet are eligible fr this order");
    }
    public void cardPayments(){
        System.out.println("Cardpayments are not eligible");
    }
    public void internetBanking(){
        System.out.println("Internet Banking is not eligible");
    }
    public void recordPaymentDetails(){
        System.out.println("Order got delivered and payments done via UPI");
    }

    public static void main(String[] args) {
        amazon a = new amazon();
        a.cashOnDelivery();
        a.upiPayments();
        a.internetBanking();
        a.cardPayments();
        a.recordPaymentDetails();
    }

}
