package org.testleaf.week2.day1;

public class Browser {
     public String launchBrowser(String browserName)
        {
            System.out.println("Browser launched Successfully");
            return browserName;

        }
     public void loadUrl()
     {
        System.out.println("Application url loaded successfully");
     }

    public static void main(String[] args) {
        Browser br=new Browser();
        br.launchBrowser("Chrome");
        br.loadUrl();
       
    }

}
