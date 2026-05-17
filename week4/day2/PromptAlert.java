package org.testleaf.week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
        public static void main(String[] args) {
    try{
        ChromeDriver driv=new ChromeDriver();
        driv.get("https://www.leafground.com/alert.xhtml");
        driv.manage().window().maximize();
        driv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driv.findElement(By.xpath("//h5[contains(text(),'Prompt Dialog')]//following::button[1]")).click();
        
        Alert prmpt=driv.switchTo().alert();
       
        prmpt.sendKeys("Testing");
        
        String alertBoxTxt=prmpt.getText();
        
        
        prmpt.accept();
        if(alertBoxTxt=="Testing"){
            System.out.println("Entered info is correct");

        }else{
            System.out.println("Entered info is not correct");
        }

    }
    catch(Exception e){
    System.out.println(e);
}
}

}
