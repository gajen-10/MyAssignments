package org.testleaf.week3.day2;

public class browser {
    // String browserName;
    // String browserVersion;

    public void openURL( String browserName, String browserVersion){
        System.out.println(browserName+" "+browserVersion+"browser got Opened");
    }
    public void  closeBrowser(){
        System.out.println("browser closed");

    }
    public void navigateBack(){
        System.out.println("Navigated back to the browser");
    }

}
