package org.testleaf.week3.realtestauto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazonProductSearch {
    public static void main(String[] args) {
        
        ChromeDriver driv=new ChromeDriver();
        driv.get("https://www.amazon.in/");
        driv.manage().window().maximize();
        driv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driv.findElement(By.xpath("//div[@class='nav-search-field ']/input")).sendKeys("Bags for boys",Keys.ENTER);
        driv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driv.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[1]")).click();
        driv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driv.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[2]")).click();
        WebElement sort=driv.findElement(By.xpath("a-dropdown-container"));
        sort.click();
        Select sortdrp=new Select(sort);
        sortdrp.selectByVisibleText("Newest Arrivals");
        String prdDetails=driv.findElement(By.xpath("(//div[@role='listitem']//h2/span)[2]")).getText();
        System.out.println(prdDetails);
        String prdPrice=driv.findElement(By.xpath("//span[@class='a-price']//span[1]")).getText();
        System.out.println(prdPrice);
        System.out.println(driv.getTitle());
    }

}
