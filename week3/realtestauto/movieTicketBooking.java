package org.testleaf.week3.realtestauto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class movieTicketBooking {
    public static void main(String[] args) {
        try{
        ChromeDriver driv=new ChromeDriver();
        driv.get("https://www.pvrcinemas.com/ ");
        
        driv.manage().window().maximize();
        driv.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String city=driv.findElement(By.xpath("(//div[@class='mx-2 now-right']//span)[3]")).getText();
        System.out.println(city);
        if(city.equals("Chennai")){
            System.out.println("Chennai city is selected");
        }else{
            driv.findElement(By.xpath("(//div[@class='p-dropdown-trigger'])[1]")).click();
            driv.findElement(By.xpath("//h6[text()='Chennai']")).click();}
        driv.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driv.findElement(By.xpath("//div[@class='d-flex quick-booking-from']//span[2]")).click();
        driv.findElement(By.xpath("//div[@id='cinema']")).click();
        driv.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//li[2]")).click();
        //
        driv.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
        Thread.sleep(1000);
        driv.findElement(By.xpath("//div[contains(@class,'p-dropdown-panel')]//li[2]")).click();
        Thread.sleep(1000);
        driv.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//li[2]")).click();
        driv.findElement(By.xpath("//div[@class='quick-lefts ']/button")).click();
        driv.findElement(By.xpath("//button[text()='Accept']")).click();
        driv.findElement(By.xpath("(//span[@class='seat-current-pvr'])[5]")).click();
        driv.findElement(By.xpath("//div[@class='register-btn']/button")).click();
        String seatinfo=driv.findElement(By.xpath("//div[@class='seat-info']")).getText();
        System.out.println(seatinfo);
        String grandTotal=driv.findElement(By.xpath("//div[contains(@class,'grand-tota')]//span")).getText();
        System.out.println(grandTotal);
        driv.findElement(By.xpath("//button[@class='fb-added-btndesk']")).click();
        Thread.sleep(35000);
        driv.findElement(By.xpath("//i[@class='pi pi-times']")).click();
        System.out.println(driv.getTitle());
    }
    catch(Exception e)
    {System.out.println(e);}
    }

}
