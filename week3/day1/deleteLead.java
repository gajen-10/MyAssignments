package org.testleaf.week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class deleteLead {
    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("guest");
        
        ChromeDriver driv=new ChromeDriver(options);
        driv.get(" http://leaftaps.com/opentaps/");
        driv.manage().window().maximize();
        driv.findElement(By.id("username")).sendKeys("DemoCSR");
        driv.findElement(By.id("password")).sendKeys("crmsfa");
        driv.findElement(By.className("decorativeSubmit")).click();
        driv.findElement(By.linkText("CRM/SFA")).click();
        driv.findElement(By.linkText("Leads")).click();
        driv.findElement(By.linkText("Find Leads")).click();
        driv.findElement(By.xpath("//span[text()='Phone']")).click();
        driv.findElement(By.xpath("//button[text()='Find Leads']")).click();
        WebElement flead=driv.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div[1]/a)[1]"));
        String firstLeadid=flead.getText();
        System.out.println(firstLeadid);
        driv.findElement(By.linkText(firstLeadid)).click();
        driv.findElement(By.linkText("Delete")).click();
        driv.findElement(By.linkText("Find Leads")).click();
        driv.findElement(By.xpath("//label[text()='Lead ID:']/following::input[1]")).sendKeys(firstLeadid);
        driv.findElement(By.xpath("//button[text()='Find Leads']")).click();
        WebElement pageElemet=driv.findElement(By.xpath("//div[@class='x-paging-info']"));
        String pagecontent=pageElemet.getText();
        if (pagecontent=="No records to display") {
            System.out.println("Lead Id has been deleted successfully");
            
        }
    }

}
