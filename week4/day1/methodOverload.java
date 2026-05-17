package org.testleaf.week4.day1;

public class methodOverload {
    public void reportStep(String msg, String status){
        System.out.println(msg+" "+status);

    }
    public void reportStep(String message, String stt, String snap){
        System.out.println(message);
        System.out.println(stt);
        System.out.println("Need to take snap: "+snap);
    }
    public static void main(String[] args) {
        methodOverload mo=new methodOverload();
        mo.reportStep("First Method", "Implemented");
        mo.reportStep("Second Method", "Implemented","Yes");
    }
}
