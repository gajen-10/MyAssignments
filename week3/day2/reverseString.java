package org.testleaf.week3.day2;

public class reverseString {

    public static void main(String[] args) {
         String name="Automation";
        System.out.println("Original text:"+name);
    //char[] charnam= name.toCharArray();
    char[] charnam=name.toCharArray();
    System.out.print("After reversing:");    
    for(int i=charnam.length-1; i>=0;i--)
    {
        System.out.print(charnam[i]);

    }
    }
   


}
