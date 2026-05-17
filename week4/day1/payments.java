package org.testleaf.week4.day1;

public interface payments {
    public void cashOnDelivery();
    public void upiPayments();
    public void cardPayments();
    public void internetBanking();
    static void deliverStatus(){
        System.out.println("Item is not delivered");
    }

}
