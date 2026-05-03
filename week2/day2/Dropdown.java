package org.testleaf.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

    public static void main(String args[])
    {
        ChromeOptions opt=new ChromeOptions();
        opt.addArguments("guest");

        ChromeDriver driv1= new ChromeDriver(opt);
        driv1.get("https://leaftaps.com/opentaps/control/main");
        driv1.manage().window().maximize();
        driv1.findElement(By.id("username")).sendKeys("DemoCSR");
        driv1.findElement(By.id("password")).sendKeys("crmsfa");
        driv1.findElement(By.className("decorativeSubmit")).click();
        driv1.findElement(By.linkText("CRM/SFA")).click();
        driv1.findElement(By.linkText("Create Lead")).click();
        driv1.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
        driv1.findElement(By.id("createLeadForm_firstName")).sendKeys("Gajendran");
        driv1.findElement(By.id("createLeadForm_lastName")).sendKeys("M");

        WebElement source=driv1.findElement(By.id("createLeadForm_dataSourceId"));
        Select srcdropdown=new Select(source);
        srcdropdown.selectByValue("LEAD_EMPLOYEE");

        WebElement industry=driv1.findElement(By.id("createLeadForm_industryEnumId"));
        Select industrydrpdwn=new Select(industry);
        industrydrpdwn.selectByValue("IND_GEN_SERVICES");

        driv1.findElement(By.className("smallSubmit")).click();;
        

        
        
    }

}
