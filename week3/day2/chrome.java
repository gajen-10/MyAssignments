package org.testleaf.week3.day2;

public class chrome extends browser{

    public void openIncognito()
    {
        System.out.println("open incognito window opened");
    }
    public void clearCache() {
        System.out.println("cleared cache");
    }

    public static void main(String[] args) {
        chrome cr=new chrome();
        cr.openURL("chrome","20.10.0");
        cr.openIncognito();
        cr.navigateBack();
        cr.clearCache();
        cr.closeBrowser();
        

    }
}
