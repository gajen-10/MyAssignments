package org.testleaf.week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class editLead {
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
        driv.findElement(By.linkText("Create Lead")).click();
        driv.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TestQA");
        driv.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Gajendran");
        driv.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("M");
        driv.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("QA");
        driv.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Testing Automation QA");
        driv.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("testqa@testleaf.com");
        WebElement state=driv.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select statedrp=new Select(state);
        statedrp.selectByVisibleText("New York");
        driv.findElement(By.xpath("//input[@name='submitButton']")).click();
        driv.findElement(By.linkText("Edit")).click();
        driv.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
        driv.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Update Testing QA Info in important field");
        driv.findElement(By.xpath("//input[@value='Update']")).click();
        String edittitle=driv.getTitle();
        System.out.println(edittitle);

    }


}
