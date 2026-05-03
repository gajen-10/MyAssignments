package org.testleaf.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class createAccount {
    public static void main(String[] args) {
        ChromeOptions opt=new ChromeOptions();
        opt.addArguments("guest");

        ChromeDriver driv=new ChromeDriver(opt);
        driv.get(" http://leaftaps.com/opentaps/");
        driv.manage().window().maximize();
        driv.findElement(By.id("username")).sendKeys("DemoCSR");
        driv.findElement(By.id("password")).sendKeys("crmsfa");
        driv.findElement(By.className("decorativeSubmit")).click();
        driv.findElement(By.linkText("CRM/SFA")).click();
        driv.findElement(By.linkText("Accounts")).click();
        driv.findElement(By.linkText("Create Account")).click();
        driv.findElement(By.id("accountName")).sendKeys("TestAccount_Gajendran");
        driv.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
        
        WebElement industry=driv.findElement(By.name("industryEnumId"));
        Select indudropdown=new Select(industry);
        indudropdown.selectByValue("IND_SOFTWARE");

        WebElement ownership=driv.findElement(By.name("ownershipEnumId"));
        Select owndropdown=new Select(ownership);
        owndropdown.selectByVisibleText("S-Corporation");

        WebElement source=driv.findElement(By.id("dataSourceId"));
        Select srcdropdown=new Select(source);
        srcdropdown.selectByValue("LEAD_EMPLOYEE");

        WebElement marketing=driv.findElement(By.id("marketingCampaignId"));
        Select markdropdown=new Select(marketing);
        markdropdown.selectByIndex(5);

        WebElement state=driv.findElement(By.id("generalStateProvinceGeoId"));
        Select statedropdown=new Select(state);
        statedropdown.selectByValue("TX");

        driv.findElement(By.className("smallSubmit")).click();


    }

}
