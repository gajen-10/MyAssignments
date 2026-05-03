package org.testleaf.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookAccount {
    public static void main(String[] args) {
        ChromeDriver driv=new ChromeDriver();
        driv.get("https://en-gb.facebook.com/");
        driv.findElement(By.linkText("Create new account")).click();
    }

}
