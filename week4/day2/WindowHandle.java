package org.testleaf.week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

    public static void main(String[] args) {
        
        ChromeDriver driv=new ChromeDriver();
        driv.get("https://www.irctc.co.in/");
        driv.manage().window().maximize();
        driv.findElement(By.linkText("FLIGHTS")).click();
        Set<String> allAddress=new HashSet<String>();
        allAddress=driv.getWindowHandles();
        System.out.println(allAddress);
        List<String> allAddresslist=new ArrayList<String>(allAddress);
        driv.switchTo().window(allAddresslist.get(1));
        System.out.println(driv.getTitle());
        driv.switchTo().window(allAddresslist.get(0));

        for(int i=0;i<allAddresslist.size();i++){
            driv.switchTo().window(allAddresslist.get(i));
            String currentTitle=driv.getTitle();
            if(currentTitle=="Flight"){
                driv.switchTo().window(allAddresslist.get(i));
            }
        }
        driv.close();
    }
}
