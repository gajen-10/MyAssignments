package org.testleaf.week4.day1;

public class childOverride extends methodOverriding{
    public void takeSnap(String str)
    {
        System.out.println("Child class printed "+str);
    }
    public void reportStep(String message){
        super.reportStep("Parent class executed");
        System.out.println("Child class step executed "+message);
    }
    public static void main(String[] args) {
        childOverride co=new childOverride();
        co.takeSnap("Yes");
        co.reportStep("overrided parent class");
    }
}
