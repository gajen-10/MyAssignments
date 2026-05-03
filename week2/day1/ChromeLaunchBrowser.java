package org.testleaf.week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunchBrowser {
    public static void main(String[] args) {
         ChromeDriver driver=new ChromeDriver();
         driver.get("https://www.facebook.com/");
         //driver.get();
        driver.manage().window().maximize();
        
        //driver.quit();
    }

   

}
