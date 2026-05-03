package org.testleaf.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestLeaf {
    public static void main(String args[])
{
    ChromeDriver driv=new ChromeDriver();
    driv.get(" https://leaftaps.com/opentaps/control/main");
    driv.manage().window().maximize();
    driv.findElement(By.id("username")).sendKeys("DemoCSR");
    driv.findElement(By.id("password")).sendKeys("crmsfa");
    driv.findElement(By.className("decorativeSubmit")).click();
}
}
