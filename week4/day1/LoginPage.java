package org.testleaf.week4.day1;

public class LoginPage extends BasePage{
    public void performCommonTasks(String mouse, String input){
        System.out.println("Child class mouse click performed: "+mouse);
        System.out.println("Enter the text into the element: "+input);

    }
    public static void main(String[] args) {
        LoginPage lp=new LoginPage();
        lp.findElement();
        lp.clickElement();
        lp.performCommonTasks("Right_Click", "Test Environent");
    }

}
