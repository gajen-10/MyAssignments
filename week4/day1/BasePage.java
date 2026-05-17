package org.testleaf.week4.day1;

public class BasePage {
    public void findElement(){
        System.out.println("Inspected the element");
    }
    public void clickElement(){
        System.out.println("Perform click operation on the element");
    }
    public void enterText(){
        System.out.println("Enter the text into the element");
    }
    public void performCommonTasks(String mouse, String input){
        System.out.println("perform click action on the element "+mouse);
        System.out.println("send the input argument to the element "+input);
    }

}
